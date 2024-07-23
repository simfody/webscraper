package ru.simfody.webscraper.entity;

import jakarta.persistence.*;

// 11.07.2024
@Entity
public class ActionScript {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 255, nullable = false)
    private String url;
    @ManyToOne
    private ParsingObject parsingObjectId;
}
