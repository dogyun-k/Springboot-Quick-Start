package com.dogyun.boardweb;

import com.dogyun.boardweb.domain.Board;
import com.dogyun.boardweb.domain.Member;
import com.dogyun.boardweb.domain.Role;
import com.dogyun.boardweb.repository.BoardRepository;
import com.dogyun.boardweb.repository.MemberRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class BoardRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private BoardRepository boardRepository;

    // @Autowired
    // private PasswordEncoder encoder;

    @Test
    public void testInsert() {
        Member member1 = new Member();
        member1.setId("member");
        member1.setPassword("member123");
        member1.setName("둘리");
        member1.setRole(Role.ROLE_MEMBER);
        member1.setEnabled(true);
        memberRepository.save(member1);

        Member member2 = new Member();
        member2.setId("admin");
        member2.setPassword("admin123");
        member2.setName("도우너");
        member2.setRole(Role.ROLE_ADMIN);
        member2.setEnabled(true);
        memberRepository.save(member2);

        for (int i = 1; i <= 13; i++) {
            Board board = new Board();
            board.setMember(member1);
            board.setTitle(member1.getName() + "가 등록한 게시글 " + i);
            board.setContent(member1.getName() + "가 등록한 게시글 " + i);
            boardRepository.save(board);
        }

        for (int i = 1; i <= 13; i++) {
            Board board = new Board();
            board.setMember(member2);
            board.setTitle(member2.getName() + "가 등록한 게시글 " + i);
            board.setContent(member2.getName() + "가 등록한 게시글 " + i);
            boardRepository.save(board);
        }
    }

    // @Test
    // public void testGetBoard(){

    // Board board = boardRepository.findById(1L).get();

    // System.out.println("[ " + board.getSeq() + "번 게시글 상세정보]");
    // System.out.println("Title\t : " + board.getTitle());
    // System.out.println("Writer\t : " + board.getMember().getName());
    // System.out.println("Content\t : " + board.getContent());
    // System.out.println("Date\t : " + board.getCreateDate());
    // System.out.println("Count\t : " + board.getCnt());
    // }

    // @Test
    // public void testGetBoardListFromMember() {
    // Member member = memberRepository.findById("member").get();

    // System.out.println("[ " + member.getName() + "가 등록한 게시글]");
    // for(Board board : member.getBoardList()){
    // System.out.println("---> " + board.toString());
    // }
    // }

}
