package com.example.SecondTry.model;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private final int Id;
    private final String username;
    private final String password;
    private final int valid;




    public User(@JsonProperty("username")String username, @JsonProperty("password")String password, @JsonProperty ("valid") int valid, @JsonProperty ("Id") int Id) {
        this.Id=Id;
        this.username = username;
        this.password=password;
        this.valid=valid;


    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {return password;}
    public int getId() {return Id;}
    public int getValid() {return valid;}

}

