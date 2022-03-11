package com.example.CodelabSwagger.service;


import com.example.CodelabSwagger.data.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserHashMap implements UserService
{
    private HashMap<String, User> userHashMap=new HashMap<>();
    @Override
    public User create(User user) {
        userHashMap.put(user.getId(),user);
        return  user;
    }

    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public List<User> all() {
        return null;
    }

    @Override
    public void deleteById(String id) {


    }

    @Override
    public User update(User user, String userId) {
        return null;
    }
}
