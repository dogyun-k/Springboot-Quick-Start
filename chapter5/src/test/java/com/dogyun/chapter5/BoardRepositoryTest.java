package com.dogyun.chapter5;

import java.util.Date;
import java.util.List;

import com.dogyun.chapter5.domain.Board;
import com.dogyun.chapter5.repository.BoardRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest
public class BoardRepositoryTest {

    @Autowired
    private BoardRepository boardRepository;

    // @Test
    // public void testInsertBoard() {
    //     Board board = new Board();

    //     board.setTitle("첫 번째 게시글");
    //     board.setWriter("테스터");
    //     board.setContent("등록 됐나요");
    //     board.setCreateDate(new Date());
    //     board.setCnt(0L);

    //     boardRepository.save(board);
    // }

    // @Test
    // public void testGetBoard() {
    //     Board board = boardRepository.findById(1L).get();
    //     System.out.println(board.toString());
    // }

    // @Test
    // public void testUpdateBoard() {
    //     System.out.println("=== 1번 게시글 조회 ===");
    //     Board board = boardRepository.findById(1L).get();
    //     System.out.println(board.toString());

    //     System.out.println("=== 1번 게시글 수정 ===");
    //     board.setTitle("수정된 제목입니다.");
    //     boardRepository.save(board);
    //     System.out.println(board.toString());
    // }

    // @Test
    // public void testDeleteBoard(){
    //     boardRepository.deleteById(1L);
    // }

    
    


}
