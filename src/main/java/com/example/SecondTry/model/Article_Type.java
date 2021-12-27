package com.example.SecondTry.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Article_Type {
    private final int Id6;
    private final String label;

    public Article_Type(@JsonProperty("Id6") int Id6,@JsonProperty("label") String label) {
        this.Id6 = Id6;
        this.label = label;
    }

    public int getId6() {
        return Id6;
    }

    public String getLabel() {
        return label;
    }
}
