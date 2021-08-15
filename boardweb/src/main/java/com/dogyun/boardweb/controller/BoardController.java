package com.dogyun.boardweb.controller;

import com.dogyun.boardweb.domain.Board;
import com.dogyun.boardweb.service.BoardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/board/")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping(value = "/getBoardList")
    public String getBoardList(Model model, Board board) {
        Page<Board> boardList = boardService.getBoardList(board);
        model.addAttribute("boardList", boardList);
        return "board/getBoardList";
    }

    @GetMapping(value = "/getBoard")
    public String getBoard(Model model, Board board) {
        model.addAttribute("board", boardService.getBoard(board));
        return "board/getBoard";
    }

    @GetMapping(value = "/insertBoard")
    public String insertBoardView() {
        return "board/insertBoard";
    }

    @PostMapping(value = "/insertBoard")
    public String insertBoard(Board board) {
        boardService.insertBoard(board);
        return "redirect:getBoardList";
    }

    @PostMapping(value = "/updateBoard")
    public String updateBoard(Board board){
        boardService.updateBoard(board);
        return "redirect:getBoardList";
    }

    @GetMapping(value = "/deleteBoard")
    public String deleteBoard(Board board){
        boardService.deleteBoard(board);
        return "forward:getBoardList";
    }
}
