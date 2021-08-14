package com.dogyun.chapter3.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.dogyun.chapter3.BoardVO;
import com.dogyun.chapter3.service.BoardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    public BoardController() {
        System.out.println("===> BoardController 생성");
    }

    @GetMapping(value = "/hello")
    public String hello(String name) {
        return boardService.hello(name);
    }

    @GetMapping(value = "/getBoard")
    public BoardVO getBoard() {
        return boardService.getBoard();
    }

    @GetMapping(value = "/getBoardList")
    public List<BoardVO> getBoardList() {
        return boardService.getBoardList();
    }
}
