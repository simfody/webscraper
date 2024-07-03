package ru.simfody.webscraper.entity;

import jakarta.persistence.*;

// 03.06.2024
@Entity
public class SiteParam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 25, nullable = false, unique = true)
    private String name;
    @Column(length = 255, nullable = false, unique = true)
    private String siteURL;
    private int minSecondsBetweenRequests = 10;
    @ManyToOne
    private Region regionId;
}
