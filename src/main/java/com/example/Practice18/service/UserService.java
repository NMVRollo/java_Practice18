package com.example.Practice18.service;

import com.example.Practice18.models.User;
import com.example.Practice18.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findByFirstName(String firstName) {
        return userRepository.findAllByFirstName(firstName);
    }
    public List<User> findByLastName(String lastName) {
        return userRepository.findAllByLastName(lastName);
    }
    public User findById(Long id) {
        return userRepository.findOneById(id);
    }

}
