package ru.simfody.webscraper.entity;

import jakarta.persistence.*;

// 07.06.2024
@Entity
public class XPath {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private ParsingObject parsingObjectId; //  >>> if not null then 'urlId' must be null
    @ManyToOne
    private Url urlId; //  >>> if not null then 'parsingObjectId' must be null
    @ManyToOne
    private FieldContentType fieldContentTypeId;
    @Column(length = 25, nullable = false)
    private String name;
    @Column(length = 255, nullable = false)
    private String locationStr;

}
