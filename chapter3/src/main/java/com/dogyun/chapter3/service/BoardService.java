package com.dogyun.chapter3.service;

import java.util.List;

import com.dogyun.chapter3.BoardVO;

public interface BoardService {
    
    String hello(String name);

    BoardVO getBoard();

    List<BoardVO> getBoardList();

}
