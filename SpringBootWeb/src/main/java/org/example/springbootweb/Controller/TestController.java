package org.example.springbootweb.Controller;

import cn.hutool.core.io.IoUtil;
import org.example.springbootweb.Pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TestController {
    @RequestMapping("/list")
    public List<User> list() {
        // 读取文件内容
        InputStream in = getClass().getClassLoader().getResourceAsStream("static/data.txt");
        ArrayList<String> lines = IoUtil.readLines(in, StandardCharsets.UTF_8, new ArrayList<>());

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

        // 返回集合
        return userList;

    }
}

