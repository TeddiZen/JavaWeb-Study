package org.example.springbootweb.service.impl;

import org.example.springbootweb.pojo.User;
import org.example.springbootweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.springbootweb.dao.UserDao;



import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public List<User> userList() {
        List<String> lines = userDao.getUserList();
        // 解析数据，变成集合
        List<User> userList = lines.stream().map(line -> {
            String[] parts = line.split(",");
            User user = new User();
            user.setId(parts[0]);
            user.setName(parts[1]);
            user.setGender(parts[2]); // 设置gender
            user.setAge(Integer.parseInt(parts[3]));
            user.setDepartment(parts[4]);
            user.setPosition(parts[5]);
            user.setEducation(parts[6]);
            user.setHireDate(parts[7]);
            user.setJoinTime(parts[7]); // 设置joinTime
            user.setPhone(parts[8]); // 注意索引可能需要调整
            return user;
        }).collect(Collectors.toList());
        return userList;
    }
}
