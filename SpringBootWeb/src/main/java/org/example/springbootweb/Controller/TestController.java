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

        // 返回集合


    }
}

