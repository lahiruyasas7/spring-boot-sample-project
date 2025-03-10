package com.example.demo.service;


import com.example.demo.dto.userDTO;
import com.example.demo.model.User;
import com.example.demo.repo.userRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private userRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<userDTO> getAllUsers() {
        List<User>userList = userRepo.findAll();
        return modelMapper.map(userList, new TypeToken<List<userDTO>>() {}.getType());
    }

    public userDTO addUser(userDTO userDTO) {
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    //update if user or insert new user
    public userDTO updateUser(userDTO userDTO) {
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }
}
