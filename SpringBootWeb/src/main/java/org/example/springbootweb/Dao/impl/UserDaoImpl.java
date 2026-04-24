package org.example.springbootweb.Dao.impl;

import cn.hutool.core.io.IoUtil;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public List<String> getUserList() {
        InputStream in = getClass().getClassLoader().getResourceAsStream("static/data.txt");
        ArrayList<String> lines = IoUtil.readLines(in, StandardCharsets.UTF_8, new ArrayList<>());
        return lines;
    }
}
