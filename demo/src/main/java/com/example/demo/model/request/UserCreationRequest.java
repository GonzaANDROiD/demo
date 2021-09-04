package com.example.demo.model.request;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class UserCreationRequest {
    private final String documentNumber;
    private final String name;
    private final Integer age;

    //TODO Agregar campos
}
