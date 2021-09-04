package com.example.demo.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.UUID;

@Getter
@RequiredArgsConstructor
public class User {
    @Id
    private final UUID userId;
    private final List<Integer> friendsId;
    private final Integer age;
    private final String name;
    private final String documentNumber;
}
