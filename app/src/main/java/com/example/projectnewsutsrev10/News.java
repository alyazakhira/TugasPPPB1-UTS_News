package com.example.projectnewsutsrev10;

public class News {
    String title;
    String category;
    int minimumAge;
    String content;
    String writer;
    String source;

    public News(String title, String category, int minimumAge, String writer, String source) {
        this.title = title;
        this.category = category;
        this.minimumAge = minimumAge;
        this.writer = writer;
        this.source = source;
    }
}
