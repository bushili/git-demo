package com.nacos.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@org.springframework.context.annotation.Configuration
@RefreshScope
@ConfigurationProperties(prefix = "test")
public  class Configuration {


    private  String username;

    private  String password;

    public String getUsername() {
        return username;
    }

    public   void setUsername(String username) {
        this.username = username;
    }

    public  String getPassword() {
        return password;
    }

    public  void setPassword(String password) {
        this.password = password;
    }

}
