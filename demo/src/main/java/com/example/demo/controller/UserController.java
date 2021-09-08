package com.example.demo.controller;


import com.example.demo.model.User;
import com.example.demo.model.request.UserCreationRequest;
import com.example.demo.model.response.UserResponse;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserResponse> create(@RequestBody UserCreationRequest newUser) {
        //Buscar como handlear exceptions en vez de hacer esta mierda
        //Arreglar el mapeo a UserResponse, buscar "Layers", el controller no debería tener lógica
        try {
            return new ResponseEntity<>(new UserResponse("OK", userService.createUser(newUser)), HttpStatus.CREATED);
        }catch(RuntimeException rte){
            return new ResponseEntity<>(new UserResponse("REPEATED", null), HttpStatus.CONFLICT);
        }
    }

    @GetMapping(path = "/{documentNumber}")
    public ResponseEntity<UserResponse> findUser(@PathVariable String documentNumber) {
        //Aca handlear bien el error cuando no se encuentra un usuario, usar el userResponse
        //Mismos comentarios de arriba
        return new ResponseEntity<>(new UserResponse("OK", userService.findUserByDocumentNumber(documentNumber)), HttpStatus.ACCEPTED);
    }
}
