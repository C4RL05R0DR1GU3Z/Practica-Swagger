package com.example.CodelabSwagger.controller;


import com.example.CodelabSwagger.data.User;
import com.example.CodelabSwagger.dto.UserDto;
import com.example.CodelabSwagger.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/v1/user" )
public class UserController
{
    private final UserService userService;

    public UserController(@Autowired UserService userService )
    {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> all()
    {

        return null;
    }

    @GetMapping( "/{id}" )

    public ResponseEntity<User> findById( @PathVariable String id )
    {

        return null;
    }


    @PostMapping


    public User create( @RequestBody UserDto userDto )
    {

        return userService.create(new User(userDto));
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<User> update(@RequestBody UserDto userDto, @PathVariable String id )
    {

        return null;
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable String id )
    {

        return null;
    }
}
