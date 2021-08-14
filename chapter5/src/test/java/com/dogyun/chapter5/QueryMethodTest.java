package com.dogyun.chapter5;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.dogyun.chapter5.domain.Board;
import com.dogyun.chapter5.repository.BoardRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@SpringBootTest
public class QueryMethodTest {

    @Autowired
    private BoardRepository boardRepository;

    // @BeforeEach
    // public void dataPrepare() {
    // for (int i = 0; i < 200; i++) {
    // Board board = new Board();
    // board.setTitle("테스트 제목 " + i);
    // board.setWriter("테스터");
    // board.setContent("테스트 내용 " + i);
    // board.setCreateDate(new Date());
    // board.setCnt(0L);
    // boardRepository.save(board);
    // }
    // }

    // @Test
    // public void testFindByTitle() {
    // List<Board> boardList = boardRepository.findByTitle("테스트 제목 10");

    // System.out.println("검색 결과");
    // for(Board board: boardList){
    // System.out.println("----> " + board.toString());
    // }
    // }

    // @Test
    // public void testByContentContaining(){
    // List<Board> boardList = boardRepository.findByContentContaining("17");
    // System.out.println("검색 결과");
    // for(Board board: boardList){
    // System.out.println("----> " + board.toString());
    // }
    // }

    // @Test
    // public void testFindByTitleContainingOrContentContaining(){
    // List<Board> boardList =
    // boardRepository.findByTitleContainingOrContentContaining("17", "26");

    // System.out.println("검색 결과");
    // for(Board board: boardList){
    // System.out.println("----> " + board.toString());
    // }
    // }

    // @Test
    // public void testFindByTitleContainingOrderBySeqDesc(){
    // List<Board> boardList =
    // boardRepository.findByTitleContainingOrderBySeqDesc("17");

    // for(Board board : boardList){
    // System.out.println(board.toString());
    // }
    // }

    // @Test
    // public void testFindByTitleContaining(){
    // Pageable paging = PageRequest.of(0, 5, Sort.Direction.DESC, "seq");

    // Page<Board> pageInfo = boardRepository.findByTitleContaining("제목", paging);

    // System.out.println("Page Size : " + pageInfo.getSize());
    // System.out.println("Total Pages : " + pageInfo.getTotalPages());
    // System.out.println("Total Count : " + pageInfo.getTotalElements());
    // System.out.println("Next : " + pageInfo.nextPageable());

    // List<Board> boardList = pageInfo.getContent();

    // System.out.println("검색 결과");
    // for(Board board : boardList){
    // System.out.println("----> " + board.toString());
    // }

    // }

    // @Test
    // public void testQueryAnnotationTest1(){
    // List<Board> boardList = boardRepository.queryAnnotationTest1("테스트 제목 10");

    // System.out.println("검색 결과");

    // for (Board board : boardList){
    // System.out.println("----> " + board.toString());
    // }

    // }

    // @Test
    // public void testQueryAnnotationTest2(){
    // List<Object[]> boardList = boardRepository.queryAnnotationTest2("테스트 제목 10");
    // System.out.println("검색 결과");
    // for(Object[] row : boardList){
    // System.out.println("----> " + Arrays.toString(row));
    // }
    // }

    // @Test
    // public void testQueryAnnotationTest3(){
    // List<Object[]> boardList = boardRepository.queryAnnotationTest3("테스트 제목 10");
    // System.out.println("검색 결과");
    // for(Object[] row : boardList){
    // System.out.println("----> " + Arrays.toString(row));
    // }
    // }

    // @Test
    // public void testQueryAnnoationTest4() {
    //     Pageable paging = PageRequest.of(0, 3, Sort.Direction.DESC, "seq");
    //     List<Board> boardList = boardRepository.queryAnnotationTest4(paging);

    //     System.out.println("검색 결과");
    //     for(Board board : boardList){
    //         System.out.println("----> " + board.toString());
    //     }
    // }
}
