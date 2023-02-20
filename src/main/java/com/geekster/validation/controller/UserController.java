package com.geekster.validation.controller;

import com.geekster.validation.model.User;
import com.geekster.validation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    public UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<String> addUser(@Valid @RequestBody User user) {
        userService.addUser(user);
        return ResponseEntity.ok("User is valid");
    }

    @GetMapping("/getAllUser")
    public List<User> getAllUsers(){

        return userService.getAllUsers();
    }

    @GetMapping("/getUser/{userId}")
    public User getUser(@RequestParam int userId){
        return userService.getUser(userId);
    }

    @PutMapping("/updateUserInfo/userId/{userId}")
    public ResponseEntity<String> updateUser(@Valid @RequestBody User newUser,@PathVariable int userId){
        userService.updateUser(userId,newUser);
        return ResponseEntity.ok("User is updated");
    }
    @DeleteMapping("/deleteUser")
    public void deleteUser(@RequestParam int userId){
        userService.deleteUser(userId);
    }
}