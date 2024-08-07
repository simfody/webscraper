package ru.simfody.webscraper.entity;

import jakarta.persistence.*;

// 10.06.2024
@Entity
public class ReportRecipient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 25, nullable = false)
    private String name;
    @Column(length = 255, nullable = false, unique = true)
    private String email;
    @ManyToOne
    private Client clientId;
    @Column(length = 1024, nullable = false, unique = true)
    private String sqlQuery;
}
