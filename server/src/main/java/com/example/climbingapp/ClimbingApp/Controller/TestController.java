package com.example.climbingapp.ClimbingApp.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TestController {

    @GetMapping("/hej")
    public String getHej(){

        return "Hej!";
    }

}