package com.sanidya.ytapp.PlayTheList.Controller;

import com.sanidya.ytapp.PlayTheList.Entity.User;
import com.sanidya.ytapp.PlayTheList.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getUsers();
    }

    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable Long userId){
        return userService.getUserDetailByID(userId);
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

}
