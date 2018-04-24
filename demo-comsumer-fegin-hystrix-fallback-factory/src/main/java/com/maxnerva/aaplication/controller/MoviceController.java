package com.maxnerva.aaplication.controller;

import com.maxnerva.aaplication.entity.User;
import com.maxnerva.aaplication.interf.UserFeginClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviceController {
    @Autowired
    private UserFeginClient userFeginClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable long id)
    {
        return this.userFeginClient.findById(id);
    }

}