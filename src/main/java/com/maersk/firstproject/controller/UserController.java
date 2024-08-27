package com.maersk.firstproject.controller;

import com.maersk.firstproject.dto.UserDto;
import com.maersk.firstproject.entities.User;
import com.maersk.firstproject.service.interfaceimpl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user/login")
    public ResponseEntity<User> createUser(@RequestBody UserDto userDto){
        return new ResponseEntity<>(userService.createUser(userDto), HttpStatus.OK);
    }
    @GetMapping("/user/{id}")
    public ResponseEntity<Optional<User>> readUser(@PathVariable int id){
        return new ResponseEntity<>(userService.readUser(id), HttpStatus.OK);
    }

    @PutMapping("/update/user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable int id,@RequestBody UserDto userDto){
        return new ResponseEntity<>(userService.updateUser(id,userDto), HttpStatus.OK);
    }

    @DeleteMapping("/delete/user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id){
        String message = "User is deleted";
        userService.deleteUser(id);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

}
