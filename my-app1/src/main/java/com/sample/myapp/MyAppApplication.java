package com.sample.myapp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MyAppApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(MyAppApplication.class).run(args);
    }
}
