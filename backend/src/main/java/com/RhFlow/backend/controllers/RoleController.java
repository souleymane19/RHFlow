package com.RhFlow.backend.controllers;

import com.RhFlow.backend.models.Role;
import com.RhFlow.backend.models.User;
import com.RhFlow.backend.services.RoleService;
import com.RhFlow.backend.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
@RequiredArgsConstructor
public class RoleController {
    private final RoleService roleService; ;
    @PostMapping("/")
    public void createUser(@RequestBody Role role) {
        roleService.add(role);
    }

    @GetMapping("/")
    public List<Role> getAllUsers() {
        return roleService.getAll();
    }
    @PostMapping("/{id}")
    public void updateUser(@PathVariable int id, @RequestBody Role role) {

    }

}
