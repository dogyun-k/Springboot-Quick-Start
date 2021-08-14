package com.dogyun.chapter6.controller;

import com.dogyun.chapter6.domain.Member;
import com.dogyun.chapter6.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@SessionAttributes("member")
@Controller
public class LoginController {

    @Autowired
    private MemberService memberService;

    @GetMapping(value = "/login")
    public void loginView() {
        // void 메소드 요청을 받으면 요청 url이랑 같은 이름의 html 파일 Response함.
    }

    @PostMapping(value = "/login")
    public String login(Member member, Model model) {
        Member findMember = memberService.getMember(member);

        if (findMember != null && findMember.getPassword().equals(member.getPassword())) {
            model.addAttribute("member", findMember);
            return "forward:getBoardList";
        } else {
            return "redirect:login";
        }
    }

    @GetMapping(value = "/logout")
    public String logout(SessionStatus status) {
        status.setComplete();
        return "redirect:index.html";
    }
}
