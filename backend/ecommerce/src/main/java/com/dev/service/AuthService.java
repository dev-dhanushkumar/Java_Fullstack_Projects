package com.dev.service;

import com.dev.response.SignupRequest;

public interface AuthService {
    
    String createUser(SignupRequest req);
}
