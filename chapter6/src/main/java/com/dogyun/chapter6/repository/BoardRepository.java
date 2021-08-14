package com.dogyun.chapter6.repository;

import com.dogyun.chapter6.domain.Board;

import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends CrudRepository<Board, Long> {
    
}
