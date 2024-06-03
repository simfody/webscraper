package ru.simfody.webscraper.entity;

import jakarta.persistence.*;

// 03.06.2024
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 35, nullable = false)
    private String name;
}
