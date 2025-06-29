package com.example.climbingapp.ClimbingApp.Repository;


import com.example.climbingapp.ClimbingApp.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long > {
}

