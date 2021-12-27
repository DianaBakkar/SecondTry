package com.example.SecondTry.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Favorites {

    public final int Id3;
    public final int articleID;
    public final int userId;

    public Favorites(@JsonProperty("Id3")int Id3, @JsonProperty(" articleID")int articleID,  @JsonProperty(" userId")int  userId) {
        this.Id3= Id3;
        this.articleID = articleID;
        this.userId = userId;
    }

    public int getId3() {return Id3;}

    public int getArticleID() {
        return articleID;
    }

    public int getUserId() {
        return userId;
    }
}
