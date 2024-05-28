package ru.simfody.webscraper.scheduler;

import org.springframework.stereotype.Component;
import org.springframework.scheduling.annotation.Scheduled;
import ru.simfody.webscraper.detail.ScraperTask;

import java.util.ArrayList;
import java.util.List;

// 28.05.2024
@Component("taskScheduler")
public class TaskScheduler {
    private List<ScraperTask> scraperTaskList = new ArrayList<>();
    private boolean           busy = false;
    // Запуск каждые 60 сек.
    @Scheduled(fixedRate = 60000)
    public void scraperTaskQueueHandlerRun() {

    }
}
