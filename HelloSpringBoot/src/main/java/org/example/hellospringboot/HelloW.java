package org.example.hellospringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloW {
    public static String defaultName = "TeddiZen";

    @RequestMapping("/request")
    public String hello(String name){
        if (name == null || name.isEmpty()) {
            name = defaultName;
        }
        System.out.println(name);
        return "Hello" + name;
    }
}
