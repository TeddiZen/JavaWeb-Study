package org.example.springbootweb.controller.impl;

import org.example.springbootweb.controller.UserController;
import org.example.springbootweb.pojo.User;
import org.example.springbootweb.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
public class UserControllerImpl implements UserController {

    private final UserService userService;

    @Autowired
    public UserControllerImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    @RequestMapping("/list")
    public List<User> returnUserList() {
        return userService.userList();
    }

}
