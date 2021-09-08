package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.model.request.UserCreationRequest;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRepository userRepository;

    public User createUser(UserCreationRequest request) {
        var user = userRepository.findByDocumentNumber(request.getDocumentNumber());
        if(user != null){
            throw new RuntimeException("User already created");
        }
        user = userRepository.save(userMapper.mapToUser(request));
        return user;
    }

    public User findUserByDocumentNumber(String documentNumber) {
        return this.userRepository.findByDocumentNumber(documentNumber);
    }

}
