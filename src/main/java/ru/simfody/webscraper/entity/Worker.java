package ru.simfody.webscraper.entity;

import jakarta.persistence.*;

// 10.06.2024
@Entity
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 25, nullable = false)
    private String name;
    @ManyToOne
    private Client clientId;
    @Column(length = 255, nullable = false)
    private String email;
}
