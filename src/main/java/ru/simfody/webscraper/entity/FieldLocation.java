package ru.simfody.webscraper.entity;

import jakarta.persistence.ManyToOne;

// 07.06.2024
public class FieldLocation {
    private ContentPage contentPageId;
    @ManyToOne
    private FieldContentType fieldContentTypeId;

}
