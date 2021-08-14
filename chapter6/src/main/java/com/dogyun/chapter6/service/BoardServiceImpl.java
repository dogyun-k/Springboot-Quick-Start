package com.dogyun.chapter6.service;

import java.util.List;

import com.dogyun.chapter6.domain.Board;
import com.dogyun.chapter6.repository.BoardRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {
    
    @Autowired
    private BoardRepository boardRepository;

    @Override
    public List<Board> getBoardList(Board board) {
        return (List<Board>)boardRepository.findAll();
    }

    @Override
    public void insertBoard(Board board) {
        boardRepository.save(board);
    }

    @Override
    public Board getBoard(Board board) {
        return boardRepository.findById(board.getSeq()).get();
    }

    @Override
    public void updateBoard(Board board) {
        Board findBoard = boardRepository.findById(board.getSeq()).get();

        findBoard.setTitle(board.getTitle());
        findBoard.setContent(board.getContent());
        boardRepository.save(findBoard);
    }

    @Override
    public void deleteBoard(Board board) {
        boardRepository.deleteById(board.getSeq());
    }

    


}
