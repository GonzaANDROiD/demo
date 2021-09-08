package com.example.demo.mapper;

import com.example.demo.model.User;
import com.example.demo.model.request.UserCreationRequest;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.UUID;

@Component
public class UserMapper {

    public User mapToUser(UserCreationRequest request) {
        //TODO estos setters no respetan inmutabilidad
        var user = new User();
        user.setAge(request.getAge());
        user.setName(request.getName());
        user.setDocumentNumber(request.getDocumentNumber());
        return user;
    }
}
