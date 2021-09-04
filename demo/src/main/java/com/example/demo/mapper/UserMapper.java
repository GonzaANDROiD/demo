package com.example.demo.mapper;

import com.example.demo.model.User;
import com.example.demo.model.request.UserCreationRequest;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.UUID;

@Component
public class UserMapper {

    public User mapToUser(UserCreationRequest request) {
        //TODO
        return new User(UUID.randomUUID(), Collections.emptyList(), request.getAge(), request.getName(), request.getDocumentNumber());
    }
}
