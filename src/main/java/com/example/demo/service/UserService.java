package com.example.demo.service;
import com.example.demo.controller.UserController;
import com.example.demo.models.User;
import org.springframework.stereotype.Service;
import com.example.demo.repository.UserRepo;
@Service
public class UserService {

    private UserController userController;

    public UserService(UserController UserController){
        this.userController = UserController;
    }
    public Iterable<User> getAllUsers() {
        return UserRepo.findAll();
    }

}
