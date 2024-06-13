package ru.simfody.webscraper.entity;

import jakarta.persistence.*;

// 14.06.2024
@Entity
public class ParseScheduler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /*
    schedule Cron expression
     ┌───────────── second (0-59)
     │ ┌───────────── minute (0 - 59)
     │ │ ┌───────────── hour (0 - 23)
     │ │ │ ┌───────────── day of the month (1 - 31)
     │ │ │ │ ┌───────────── month (1 - 12) (or JAN-DEC)
     │ │ │ │ │ ┌───────────── day of the week (0 - 7)
     │ │ │ │ │ │          (0 or 7 is Sunday, or MON-SUN)
    */
    private int second = - 1;             //(0-59) <- '-1' - is "*"
    private int minute = - 1;             // (0 - 59) <- '-1' - is "*"
    private int hour = - 1;               // (0 - 23) <- '-1' - is "*"
    private int dayOfTheMonth = - 1;      //  (1 - 31) <- '-1' - is "*"
    private int month = - 1;              //   (1 - 12) (or JAN-DEC)  <- '-1' - is "*"
    private int dayOfTheWeek = - 1;       //   dayOfTheWeek (1 - 7 -> MON-SUN)
    @ManyToOne
    private ParseSite siteForParseParamId;
}
