package com.example.SecondTry.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Article {
    private final int Id1;
    private final String title;
    private final String description;
    private final double price;
    private final int publishDate;
    private final int status;

    public Article(@JsonProperty("Id1")Integer Id1, @JsonProperty ("title")String title,@JsonProperty ("description")String description,
                   @JsonProperty ("price")double price, @JsonProperty ("publishDate")int publishDate,
                   @JsonProperty ("status")int status) {
        this.Id1 = Id1;
        this.title=title;
        this.description = description;
        this.price = price;
        this.publishDate = publishDate;
        this.status=status;
    }

    public int getId1() {
        return Id1;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public int getStatus() {
        return status;
    }
}
