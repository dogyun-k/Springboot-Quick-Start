package com.dogyun;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dogyun.domain.Board;

public class JPAClient {

    public static void main(String[] args) {
        // EntityManager 생성
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("chapter4");
        EntityManager em = emf.createEntityManager();

        // Transaction 생성
        EntityTransaction tx = em.getTransaction();

        //// 글 등록 시작 ////
        // try {
        // // Transaction 시작
        // tx.begin();

        // Board board = new Board();
        // board.setTitle("JPA 제목");
        // board.setWriter("관리자");
        // board.setContent("JPA 글 등록 잘 되네요.");
        // board.setCreateDate(new Date());
        // board.setCnt(0L);

        // // 글 등록
        // em.persist(board);

        // // Transaction Commit
        // tx.commit();
        // } catch (Exception e) {
        // e.printStackTrace();

        // // Transaction Rollback
        // tx.rollback();
        // } finally {
        // em.close();
        // emf.close();
        // }
        //// 글 등록 끝 ////

        //// 글 검색 시작 ////
        // try {
        // Board searchBoard = em.find(Board.class, 1L);
        // System.out.println("----> " + searchBoard.toString());
        // } catch (Exception e) {
        // e.printStackTrace();
        // } finally {
        // em.close();
        // emf.close();
        // }

        // 글 수정
        // try {
        // tx.begin();

        // Board board = em.find(Board.class, 1L);
        // board.setTitle("검색한 게시글의 제목 수정");

        // tx.commit();
        // } catch (Exception e) {
        // e.printStackTrace();
        // tx.rollback();
        // } finally {
        // em.close();
        // emf.close();
        // }

        // 글 삭제
        // t

        // 글 목록 조회
        try {
            tx.begin();

            // 등록 후
            Board board = new Board();
            board.setTitle("JPA 제목");
            board.setWriter("관리자");
            board.setContent("JPA 글 등록 잘 됨");
            board.setCreateDate(new Date());
            board.setCnt(0L);

            em.persist(board);

            tx.commit();

            // 글 목록 조회
            String jpql = "select b from Board b order by b.seq desc";
            List<Board> boardList = em.createQuery(jpql, Board.class).getResultList();
            for (Board brd : boardList) {
                System.out.println("----> " + brd.toString());
            }
            tx.commit();

        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        } finally {
            em.close();
            emf.close();
        }
    }
}
