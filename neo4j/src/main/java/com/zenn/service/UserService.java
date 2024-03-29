package com.zenn.service;

import com.zenn.model.User;
import com.zenn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public Collection<User> getAll() {
        return userRepository.getAllUsers();
    }
}
