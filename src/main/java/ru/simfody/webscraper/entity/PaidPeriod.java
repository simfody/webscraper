package ru.simfody.webscraper.entity;

import jakarta.persistence.*;

import java.util.Date;

// 24.07.2024
@Entity
public class PaidPeriod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Client clientId; //  >>> if not null then 'parsingObjectId' must be null
    @ManyToOne
    private ParsingObject parsingObjectId; //  >>> if not null then 'clientId' must be null
    private Date paidPeriodBegin;
    private Date paidPeriodEnd;

}
