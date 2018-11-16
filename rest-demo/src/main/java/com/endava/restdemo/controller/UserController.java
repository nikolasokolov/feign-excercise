package com.endava.restdemo.controller;

import com.endava.restdemo.model.User;
import com.endava.restdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public Optional<User> findById(@PathVariable(value = "id") Long id) {
        return userService.findById(id);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public void save(@RequestBody User user) {
        userService.save(user);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable(value = "id") Long id) {
        userService.deleteById(id);
    }
}
