package com.dev.service.impl;

import org.springframework.stereotype.Service;

import com.dev.config.JwtProvider;
import com.dev.model.User;
import com.dev.repository.UserRepository;
import com.dev.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final JwtProvider jwtProvider;
    @Override
    public User findUserByJwtToken(String jwt) throws Exception {
        String email = jwtProvider.getEmailfromJwtToken(jwt);

        return this.findUserByEmail(email);
    }

    @Override
    public User findUserByEmail(String email) {
        User user = userRepository.findByEmail(email);
        if(user == null) {
            try {
                throw new Exception("user not found with email - "+email);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return user;
    }
    
}
