package com.dev.request;

import com.dev.domain.USER_ROLE;

import lombok.Data;

@Data
public class LoginOtp {
    private String email;
    private String otp;
    private USER_ROLE role;
}
