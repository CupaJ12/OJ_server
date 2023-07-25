package com.example.demo.controller;
import com.example.demo.models.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/user")
public class UserController {
    public UserService userService;

public UserController (UserService userService){
    this.userService = userService;
}

@GetMapping
    public Iterable <User> getAllUsers (){
    this.userService.
}

@PostMapping
    public Boolean register (@RequestBody User newUser){
    return this.userService.register(newUser);
}

}
