package com.dawnchen.boot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: Learn-SpringBoot3
 * @BelongsPackage: com.dawnchen.boot.controller
 * @Author: dawnchen
 * @CreateTime: 2025-03-18  11:36
 * @Description: TODO
 */

//@ResponseBody
//@Controller
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot 3!";
    }
}
