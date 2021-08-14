package com.dogyun.chapter1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
    
    @GetMapping(value = "/getBoardList")
    public List<BoardVO> getBoardList(){
        List<BoardVO> boardList = new ArrayList<BoardVO>();

        for(int i = 0; i < 10; i++){
            BoardVO board = new BoardVO();
            board.setSeq(i);
            board.setTitle("title" + i);
            board.setWriter("dogyun");
            board.setContent("content" + i);
            board.setCreateDate(new Date());
            board.setCnt(0);
            boardList.add(board);
        }

        return boardList;
    }
}
