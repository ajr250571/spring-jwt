package com.foxy.springjwt.Api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ApiController {
    @GetMapping(value = "demo")
    public String wellcome() {
        return "Wellcome endpoint";
    }

}
