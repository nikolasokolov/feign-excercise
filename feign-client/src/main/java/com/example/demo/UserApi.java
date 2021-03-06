package com.example.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "userClient", url = "http://localhost:8080/users")
public interface UserApi {
    @RequestMapping(method = RequestMethod.GET)
    List<User> userInfo();
}
