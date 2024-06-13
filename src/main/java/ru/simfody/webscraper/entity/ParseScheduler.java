package ru.simfody.webscraper.entity;

import jakarta.persistence.*;

// 14.06.2024
@Entity
public class ParseScheduler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 25, nullable = false, unique = true)
    private String name;
}