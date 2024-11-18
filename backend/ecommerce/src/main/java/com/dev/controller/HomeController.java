package com.dev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.response.ApiResponse;

@RestController
public class HomeController {
    @GetMapping("/")
    public ApiResponse homeControllerHandler() {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("Welcome to Spring Boot API");
        return apiResponse;
    }
}
