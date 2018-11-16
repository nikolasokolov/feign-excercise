package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserApiController {
    @Autowired
    private UserApi userApi;

    @RequestMapping(value = "/userinfo")
    public List<User> userInfo() {
        return userApi.userInfo();
    }
}
