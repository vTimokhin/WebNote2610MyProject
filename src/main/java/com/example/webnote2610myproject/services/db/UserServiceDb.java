package com.example.webnote2610myproject.services.db;

import com.example.webnote2610myproject.repos.UserRepository;
import com.example.webnote2610myproject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceDb implements UserService {
    @Autowired
    private UserRepository userRepository;
}
