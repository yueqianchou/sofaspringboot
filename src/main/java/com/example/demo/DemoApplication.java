package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: duanww
 * @Date: 2019/3/04 14:34
 */
@SpringBootApplication
@MapperScan("com.example.demo.dao.*")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("------->start success");
    }
}
