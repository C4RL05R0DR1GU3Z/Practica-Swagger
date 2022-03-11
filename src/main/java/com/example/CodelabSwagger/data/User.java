package com.example.CodelabSwagger.data;


import com.example.CodelabSwagger.dto.UserDto;

import java.util.Date;

public class User {

    private String id;
    private String name;
    private String lastName;
    private String email;
    private Date createdAt;

    public User() {
    }

    public User(String id, String name, String lastName, String email, Date createdAt) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.createdAt = createdAt;
    }


    public User(UserDto userDto){

        this.name=userDto.getName();
        this.lastName=userDto.getLastName();
        this.email=userDto.getEmail();

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
