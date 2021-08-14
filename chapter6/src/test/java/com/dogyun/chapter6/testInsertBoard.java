package com.dogyun.chapter6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.dogyun.chapter6.domain.Board;
import com.dogyun.chapter6.repository.BoardRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class testInsertBoard {
    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void testInsertBoard() {

        for (int i = 0; i < 20; i++) {
            Board board = new Board();
            board.setSeq(new Long(i));
            board.setTitle("Title " + i);
            board.setContent("Content " + i);
            board.setWriter("Tester");
            board.setCreateDate(new Date());
            board.setCnt(0L);
            boardRepository.save(board);
        }
    }
}
