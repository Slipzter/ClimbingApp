package com.example.climbingapp.ClimbingApp.Controller;


import com.example.climbingapp.ClimbingApp.Entity.User;
import com.example.climbingapp.ClimbingApp.Repository.UserRepository;
import com.example.climbingapp.ClimbingApp.Resource.UserRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user")
    public ResponseEntity<List<User>> showAllUsers() {
        return ResponseEntity.ok(this.userRepository.findAll());
    }

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody UserRequest userRequest) {

        User user = new User();
        user.setUserFirstName(userRequest.getFirstName());
        user.setUserLastName(userRequest.getLastName());
        user.setUserEmail(userRequest.getEmail());

        return ResponseEntity.status(201).body(this.userRepository.save(user));
    }


}
