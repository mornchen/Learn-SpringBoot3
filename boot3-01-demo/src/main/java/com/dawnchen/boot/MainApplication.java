package com.dawnchen.boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
*@BelongsProject: Learn-SpringBoot3
*@BelongsPackage: com.dawnchen.boot
*@Author: dawnchen
*@CreateTime: 2025-03-18  11:19
*@Description: 启动SpringBoot项目的主入口程序
*/

@SpringBootApplication //这是一个SpringBoot应用
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
