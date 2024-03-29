package com.foxy.springjwt.Auth;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    @PostMapping(value = "login")
    public String login() {
        return "Login endpoint";
    }

    @PostMapping(value = "register")
    public String register() {
        return "Register endpoint";
    }
}
