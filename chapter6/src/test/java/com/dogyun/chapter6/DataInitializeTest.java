package com.dogyun.chapter6;

import java.util.Date;

import com.dogyun.chapter6.domain.Board;
import com.dogyun.chapter6.domain.Member;
import com.dogyun.chapter6.repository.BoardRepository;
import com.dogyun.chapter6.repository.MemberRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import net.bytebuddy.asm.MemberRemoval;

@SpringBootTest
public class DataInitializeTest {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void testDataInsert() {
        Member member1 = new Member();
        member1.setId("member1");
        member1.setPassword("member111");
        member1.setName("둘리");
        member1.setRole("User");
        memberRepository.save(member1);

        Member member2 = new Member();
        member2.setId("member2");
        member2.setPassword("member222");
        member2.setName("도우너");
        member2.setRole("Admin");
        memberRepository.save(member2);

        for (int i = 0; i < 3; i++) {
            Board board = new Board();
            board.setWriter("둘리");
            board.setTitle("둘리가 등록한 게시글 " + i);
            board.setContent("둘리의 내용" + i);
            boardRepository.save(board);
        }

        for (int i = 0; i < 3; i++) {
            Board board = new Board();
            board.setWriter("도우너");
            board.setTitle("도우너가 등록한 게시글 " + i);
            board.setContent("도우너의 내용" + i);
            boardRepository.save(board);
        }
    }
}
