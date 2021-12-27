package com.example.SecondTry.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Types {
    private final int Id4;
    private final int valid;
    private final String label;

    public Types(@JsonProperty("Id4") int Id4, @JsonProperty("valid")int valid, @JsonProperty("label")String label) {
        this.Id4 = Id4;
        this.valid = valid;
        this.label = label;
    }
}
