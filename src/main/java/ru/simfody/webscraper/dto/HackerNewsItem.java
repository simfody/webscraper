package ru.simfody.webscraper.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HackerNewsItem {
    private String title;

    private String url ;
    private String author;
    private int score;
    private int position ;
    private int id ;

    public HackerNewsItem(String title, String url, String author, int score, int position, int id) {
        super();
        this.title = title;
        this.url = url;
        this.author = author;
        this.score = score;
        this.position = position;
        this.id = id;
    }
}
