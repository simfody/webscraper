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
@Component("scrapertaskScheduler")
public class ScraperTaskScheduler {
    private List<ScraperTask>           stQueueList  = new ArrayList<>();
    private List<ScraperTask>           stLogList   = new ArrayList<>();
    private ScraperTaskQueueListHandler scraperTaskQueueListHandler;

    public ScraperTaskScheduler(ScraperTaskQueueListHandler scraperTaskQueueListHandler) {
        this.scraperTaskQueueListHandler = scraperTaskQueueListHandler;
    }

    // Запуск каждые 10 сек.
    @Async
    @Scheduled(fixedRate = 10000)
    public void scraperTaskQueueListHandlerRuner() {
        System.out.println("test -> ");
        if(stQueueList.size() != 0) return;
        scraperTaskQueueListMaker();
      //  scraperTaskQueueListHandler.studyScraper(stQueueList, stLogList);
    }

    private void scraperTaskQueueListMaker() {

    }
}
