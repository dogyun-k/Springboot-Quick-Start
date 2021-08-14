package com.dogyun.chapter3.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.dogyun.chapter3.BoardVO;

import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

    @Override
    public String hello(String name) {
        return "hello : " + name;
    }

    @Override
    public BoardVO getBoard() {
        BoardVO board = new BoardVO();
        board.setSeq(1);
        board.setTitle("title");
        board.setWriter("dogyun");
        board.setContent("content");
        board.setCreateDate(new Date());
        board.setCnt(0);
        return board;
    }

    @Override
    public List<BoardVO> getBoardList() {
        List<BoardVO> boardList = new ArrayList<BoardVO>();

        for (int i = 0; i < 10; i++) {
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
