package com.example.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 陈李星
 * @create 2022-11-25 15:11
 */
@SpringBootApplication
public class GitTest01Application {
    public static void main(String[] args) {
        SpringApplication.run(GitTest01Application.class,args);
        System.out.println("hello Git!");
    }
}
