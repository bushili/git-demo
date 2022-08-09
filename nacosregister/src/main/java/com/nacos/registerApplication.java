package com.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class registerApplication {


    public static void main(String[] args) {
        SpringApplication.run(registerApplication.class);
        System.out.println(test());
    }


    private static String test() {
        String result = "";
        try {
            result = "try语句块值";
            System.out.println();
            return result;
        } finally {
            result = "finally  语句块值";
        }
    }

}
