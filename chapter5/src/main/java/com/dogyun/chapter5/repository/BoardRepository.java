package com.dogyun.chapter5.repository;

import java.util.List;

import com.dogyun.chapter5.domain.Board;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BoardRepository extends CrudRepository<Board, Long> {
    List<Board> findByTitle(String title);

    List<Board> findByContentContaining(String keyword);

    List<Board> findByTitleContainingOrContentContaining(String title, String content);

    List<Board> findByTitleContainingOrderBySeqDesc(String keyword);

    Page<Board> findByTitleContaining(String keyword, Pageable paging);

    // @Query("SELECT b FROM Board b " + "WHERE b.title like %:keyword% " + "ORDER BY b.seq DESC")
    // List<Board> queryAnnotationTest1(@Param("keyword") String keyword);

    // @Query("SELECT b.seq, b.title, b.writer, b.createDate " + "FROM Board b " + "WHERE b.title like %:keyword% "
    //         + "ORDER BY b.seq DESC")
    // List<Object[]> queryAnnotationTest2(@Param("keyword") String keyword);

    // @Query(value="select seq, title, writer, create_date " + "from board where title like '%'||?1||'%' " + "order by seq desc", nativeQuery = true)
    // List<Object[]> queryAnnotationTest3(String keyword);
    
    // @Query("SELECT b FROM Board b ORDER BY b.seq DESC")
    // List<Board> queryAnnotationTest4(Pageable paging);
}
