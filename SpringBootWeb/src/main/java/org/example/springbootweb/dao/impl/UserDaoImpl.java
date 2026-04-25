package org.example.springbootweb.dao.impl;

import cn.hutool.core.io.IoUtil;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.example.springbootweb.dao.UserDao;


@Repository
public class UserDaoImpl implements UserDao {

    // 从文件中取数据
    @Override
    public List<String> getUserList() {
        InputStream in = getClass().getClassLoader().getResourceAsStream("static/data.txt");
        ArrayList<String> lines = IoUtil.readLines(in, StandardCharsets.UTF_8, new ArrayList<>());
        return lines;
    }
}
