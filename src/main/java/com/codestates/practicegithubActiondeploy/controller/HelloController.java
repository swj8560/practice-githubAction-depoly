package com.codestates.practicegithubActiondeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello () {
        return "헬로우 월드! 헬로우 백엔드 부트캠프!";
    }
}
