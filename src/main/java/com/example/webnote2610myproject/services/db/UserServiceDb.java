package com.example.webnote2610myproject.services.db;

import com.example.webnote2610myproject.models.User;
import com.example.webnote2610myproject.repos.UserRepository;
import com.example.webnote2610myproject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceDb implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
