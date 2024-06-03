package ru.simfody.webscraper.entity;

import jakarta.persistence.*;

// 03.06.2024
@Entity
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 25, nullable = false)
    private String name;
}