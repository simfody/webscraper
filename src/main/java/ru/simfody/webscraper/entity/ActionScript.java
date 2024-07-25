package ru.simfody.webscraper.entity;

import jakarta.persistence.*;

// 11.07.2024
@Entity
public class ActionScript {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private SiteParam siteParamId; //  >>> if not null then 'parsingObjectId' must be null
    @ManyToOne
    private ParsingObject parsingObjectId; //  >>> if not null then 'siteParamId' must be null
}
