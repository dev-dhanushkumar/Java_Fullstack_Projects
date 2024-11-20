package com.dev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.dev.model.User;
import com.dev.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users/profile")
    public ResponseEntity<User> getUserProfile(@RequestHeader("Authorization") String jwt)throws Exception {
        User user = userService.findUserByJwtToken(jwt);

        return ResponseEntity.ok(user);
    }
}
