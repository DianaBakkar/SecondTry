package com.example.SecondTry.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.File;

public class Articles_Docs {
    private final int Id5;
    private final int articleId;
    private final File photo;

    public Articles_Docs(@JsonProperty("Id5") int Id5, @JsonProperty("articleId")int articleId, @JsonProperty("photo")File photo) {
        this.Id5 = Id5;
        this.articleId = articleId;
        this.photo = photo;
    }

    public int getId5() {
        return Id5;
    }

    public int getArticleId() {
        return articleId;
    }

    public File getPhoto() {
        return photo;
    }
}
