package ru.simfody.webscraper.entity;

import jakarta.persistence.*;

// 03.06.2024
@Entity
public class ContentLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 25, nullable = false)
    private String name;
    @ManyToOne
    private Product productId;
    @ManyToOne
    private SiteForParseParam siteForParseParamId;
    @ManyToOne
    private FieldContentType fieldContentTypeId;
    @ManyToOne
    private Region regionId;

}
