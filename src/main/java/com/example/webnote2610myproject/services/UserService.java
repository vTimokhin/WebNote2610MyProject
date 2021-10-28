package com.example.webnote2610myproject.services;

import com.example.webnote2610myproject.models.User;

public interface UserService {
    User findByLogin(String login);
    User save(User user);
}
