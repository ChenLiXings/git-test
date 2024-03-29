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
        System.out.println("hello World");
        System.out.println("hello Git1");
        System.out.println("hello Git2");
        System.out.println("master test");
        System.out.println("hot-fix test");
        System.out.println("push test");
        System.out.println("pull test");
        System.out.println("gitee push");
        System.out.println("gitee test2");
        System.out.println("this is new one");
        System.out.println("this is new two");
    }
}
