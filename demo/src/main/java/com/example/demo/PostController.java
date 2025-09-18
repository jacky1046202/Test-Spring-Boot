package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController 告訴 Spring Boot，這個類別是專門用來處理網路請求的
@RestController
public class PostController {

    // @GetMapping("/api/posts") 告訴 Spring Boot：
    // 如果有人用 GET 方式訪問 "http://localhost:8080/api/posts" 這個網址
    // 就請執行下面的這個 getPosts() 方法
    @GetMapping("/niggers")
    public String getPosts() {
        // 這個方法會回傳一個簡單的字串
        return "NIGGGGGGGERRRRRRR";
    }
}