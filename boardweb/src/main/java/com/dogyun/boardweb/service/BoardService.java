package com.dogyun.boardweb.service;

import com.dogyun.boardweb.domain.Board;

import org.springframework.data.domain.Page;

public interface BoardService {
    
    void insertBoard(Board board);
    
    void updateBoard(Board board);

    void deleteBoard(Board board);

    Board getBoard(Board board);

    Page<Board> getBoardList(Board board);
}
