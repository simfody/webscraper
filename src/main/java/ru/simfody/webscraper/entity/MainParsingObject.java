package ru.simfody.webscraper.entity;

import jakarta.persistence.*;

// 03.06.2024
@Entity
public class MainParsingObject { // Product or other parse object ...
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 35, nullable = false)
    private String name;
    @ManyToOne
    private Client clientId;
}
