package com.example.demo.controller;

import com.example.demo.dto.userDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1")
public class userController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public List<userDTO> getUser(){
        return userService.getAllUsers();
    }

    @PostMapping("/add-user")
    public userDTO addUser(@RequestBody userDTO userDTO){
        return userService.addUser(userDTO);
    }

    @PutMapping("/update-user")
    public userDTO updateUser(@RequestBody userDTO userDTO){
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/delete-user")
    public String userDelete(@RequestBody userDTO userDTO){
        return userService.deleteUser(userDTO);
    }
}
