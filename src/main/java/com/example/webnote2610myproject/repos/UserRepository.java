package com.example.webnote2610myproject.repos;

import com.example.webnote2610myproject.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByLogin(String login);

}