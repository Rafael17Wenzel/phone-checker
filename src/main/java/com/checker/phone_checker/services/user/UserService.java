package com.checker.phone_checker.services.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.checker.phone_checker.models.User;
import com.checker.phone_checker.repositories.user.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public Optional<User> verifyIfUserExists(Long id) {
        return userRepository.findById(id);
    }

}
