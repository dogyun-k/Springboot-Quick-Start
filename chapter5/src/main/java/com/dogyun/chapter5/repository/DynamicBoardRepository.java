package com.dogyun.chapter5.repository;

import com.dogyun.chapter5.domain.Board;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface DynamicBoardRepository extends CrudRepository<Board, Long>, QuerydslPredicateExecutor<Board> {

}
