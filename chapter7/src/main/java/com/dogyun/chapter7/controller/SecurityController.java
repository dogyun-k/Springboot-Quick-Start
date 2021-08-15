package com.dogyun.chapter7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    @GetMapping(value = "/")
    public String index() {
        System.out.println("index 요청입니다.");
        return "index";
    }

    @GetMapping(value = "/member")
    public void forMember() {
        System.out.println("Member 요청입니다.");
    }

    @GetMapping(value = "/manager")
    public void forManager() {
        System.out.println("Manager 요청입니다.");
    }

    @GetMapping(value = "/admin")
    public void forAdmin() {
        System.out.println("Admin 요청입니다.");
    }

    @GetMapping(value = "/login")
    public void login() {

    }

    @GetMapping(value = "/loginSuccess")
    public void loginSuccess() {

    }

    @GetMapping("/accessDenied")
    public void accessDenied() {

    }
}
