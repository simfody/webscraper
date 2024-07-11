package ru.simfody.webscraper.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// 11.07.2024
@Entity
public class ActionScript {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
