package com.example.xdclass.service;

import com.example.xdclass.domain.User;

import java.util.List;

public interface UserService {
    public String login(String username, String pwd);

    List<User> listUser();

}
