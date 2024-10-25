package com.RhFlow.backend.controllers;

import com.RhFlow.backend.models.Role;
import com.RhFlow.backend.models.User;
import com.RhFlow.backend.services.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping("/")
    public void createUser(@RequestBody User user) {
        userService.add(user);
    }

    @GetMapping("/")
    public List<User> getAllUsers() {
        return userService.getAll();
    }

    @PostMapping("/{id}")
    public ResponseEntity<Void> updateUser(@PathVariable Long id, @RequestBody User user) {
        userService.update(id, user);
       return  ResponseEntity.accepted().build();

    }
}
