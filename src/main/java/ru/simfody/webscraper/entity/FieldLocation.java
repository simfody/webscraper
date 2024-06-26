package ru.simfody.webscraper.entity;

import jakarta.persistence.*;

// 07.06.2024
@Entity
public class FieldLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Page contentPageId;
    @ManyToOne
    private FieldContentType fieldContentTypeId;
    @Column(length = 25, nullable = false)
    private String name;
    @Column(length = 255, nullable = false)
    private String locationStr;

}
