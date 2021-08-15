package com.dogyun.boardweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    @GetMapping(value = "/system/login")
    public void login() {
    }

    @GetMapping(value = "/system/accessDenied")
    public void accessDenied() {
    }

    @GetMapping(value = "/system/logout")
    public void logout() {
    }

    @GetMapping(value = "/admin/adminPage")
    public void adminPage() {
    }
}
