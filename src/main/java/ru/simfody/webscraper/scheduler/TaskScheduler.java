package ru.simfody.webscraper.scheduler;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;
import org.springframework.scheduling.annotation.Scheduled;
import ru.simfody.webscraper.detail.ScraperTask;
import ru.simfody.webscraper.handlers.ScraperTaskQueueListHandler;

import java.util.ArrayList;
import java.util.List;

// 28.05.2024
@EnableAsync
@Component("taskScheduler")
public class TaskScheduler {
    private List<ScraperTask>           stQueueList  = new ArrayList<>();
    private List<ScraperTask>           stLogList   = new ArrayList<>();
    private ScraperTaskQueueListHandler scraperTaskQueueListHandler;

    public TaskScheduler(ScraperTaskQueueListHandler scraperTaskQueueListHandler) {this.scraperTaskQueueListHandler = scraperTaskQueueListHandler;}

    // Запуск каждые 10 сек.
    @Async
    @Scheduled(fixedRate = 10000)
    public void scraperTaskQueueListHandlerRuner() {
        if(stQueueList.size() != 0) return;
        scraperTaskQueueListMaker();
        scraperTaskQueueListHandler.studyScraper(stQueueList, stLogList);
    }

    private void scraperTaskQueueListMaker() {

    }
}
