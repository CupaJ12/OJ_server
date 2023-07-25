package com.example.demo.service;
import com.example.demo.controller.UserController;
import com.example.demo.models.User;
import org.springframework.stereotype.Service;
import com.example.demo.repository.UserRepo;
@Service
public class UserService {

    private UserRepo userRepo;

    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }
    public Iterable<User> getAllUsers() {
        return UserRepo.findAll();
    }

    public Boolean register(User newUser) {
       User newRegisteredUser = new User(newUser.id);
if(newUser != null){
    if(newUser.name)
}
        this.userRepo.save(newUser);
    }
}
