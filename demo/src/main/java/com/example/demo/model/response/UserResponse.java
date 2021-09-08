package com.example.demo.model.response;

import com.example.demo.model.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class UserResponse {
    private final String message;
    private final User user;
}
