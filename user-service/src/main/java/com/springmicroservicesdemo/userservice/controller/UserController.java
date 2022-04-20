package com.springmicroservicesdemo.userservice.controller;

import com.springmicroservicesdemo.userservice.VO.ResponseTemplateVO;
import com.springmicroservicesdemo.userservice.entity.User;
import com.springmicroservicesdemo.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        log.info("Inside saveUser of userController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
        log.info("Inside getUserWithDepartment of UserController ");

        return userService.getUserWithDepartment(userId);
    }


}
