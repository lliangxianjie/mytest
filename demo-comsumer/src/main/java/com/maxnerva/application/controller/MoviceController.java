package com.maxnerva.application.controller;

import com.maxnerva.application.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MoviceController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable long id)
    {
        String url = "http://127.0.0.1:7900/"+id;
        return this.restTemplate.getForObject(url,User.class);
    }

}