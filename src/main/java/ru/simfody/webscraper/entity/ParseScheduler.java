package ru.simfody.webscraper.entity;

import jakarta.persistence.*;

// 14.06.2024
@Entity
public class ParseScheduler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int second = - 1;             //(0-59) '-1' - is off
    private int minute = - 1;             // (0 - 59) '-1' - is off
    private int hour = - 1;               // (0 - 23) '-1' - is off
    private int dayOfTheMonth = - 1;      //  (1 - 31) '-1' - is off
    private int month = - 1;              //   (1 - 12) (or JAN-DEC) '-1' - is off
    private int dayOfTheWeek = - 1;       //   dayOfTheWeek (1 - 7 -> MON-SUN)
    @ManyToOne
    private ParseSite siteForParseParamId;
}
