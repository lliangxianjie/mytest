package com.maxnerva.aaplication.impl;

import com.maxnerva.aaplication.entity.User;
import com.maxnerva.aaplication.interf.UserFeginClient;

public class FeignClientFallBack implements UserFeginClient {
    @Override
    public User findById(long id) {
        User user = new User();
        user.setId(-1L);
        user.setUsername("default");
        return user;
    }
}
