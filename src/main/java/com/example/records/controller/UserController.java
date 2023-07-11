package com.example.records.controller;

import com.example.records.model.User;
import com.example.records.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("")
    public ResponseEntity<List<User>> findAllUsers() {
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> findUserWithId(@PathVariable Integer userId) {
        return new ResponseEntity<>(userRepository.findById(userId).orElse(null), HttpStatus.OK);
    }
}
