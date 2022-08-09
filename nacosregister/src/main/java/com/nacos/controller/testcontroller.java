package com.nacos.controller;


import com.nacos.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//asdasdasd
@RestController
@RefreshScope
public class testcontroller {
    @Value("${user.name}")
    private String username;
    @Value("${user.password}")
    private String password;


    @Autowired
    private com.nacos.entity.user user;

    @Autowired
    private Configuration configuration;

    @GetMapping("/testuser")
    public String testyuser(){
        String test = configuration.getUsername();
        System.out.println("test:"+test);
        System.out.println(username);
        return "111"+user.getName()+user.getPassword();
    }



}
