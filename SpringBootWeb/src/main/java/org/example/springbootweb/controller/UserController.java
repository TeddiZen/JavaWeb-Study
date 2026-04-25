package org.example.springbootweb.controller;

import org.example.springbootweb.pojo.User;

import java.util.List;

public interface UserController {
    List<User> returnUserList();
}
