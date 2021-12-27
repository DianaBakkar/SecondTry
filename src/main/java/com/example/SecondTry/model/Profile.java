package com.example.SecondTry.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Profile {
    public final int Id2;
    public final String FName;
    public final String LName;
    public final int DOB;
    public final String email;

    public Profile(@JsonProperty("Id2")Integer Id2,@JsonProperty("FName")String FName,@JsonProperty("LName")String LName,
                   @JsonProperty("DOB")Integer DOB,@JsonProperty("email")String email)
    {
        this.Id2 = Id2;
        this.FName = FName;
        this.LName = LName;
        this.DOB = DOB;
        this.email = email;
    }

    public int getId2() {return Id2;}

    public String getFName() {return FName;}

    public String getLName() {return LName;}

    public int getDOB() {return DOB;}

    public String getEmail() {return email;}
}
