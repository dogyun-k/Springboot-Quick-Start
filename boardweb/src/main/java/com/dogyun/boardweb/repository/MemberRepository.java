package com.dogyun.boardweb.repository;

import com.dogyun.boardweb.domain.Member;

import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, String> {
    
}
