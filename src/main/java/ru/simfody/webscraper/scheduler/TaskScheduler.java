package ru.simfody.webscraper.scheduler;

import org.springframework.stereotype.Component;
import org.springframework.scheduling.annotation.Scheduled;
// 28.05.2024
@Component("taskScheduler")
public class TaskScheduler {
    // Запуск каждые 900 сек. (15 мин)
//		@Scheduled(cron="0/900 * * * * *")
    public void scraperTaskRun() {

    }
}
