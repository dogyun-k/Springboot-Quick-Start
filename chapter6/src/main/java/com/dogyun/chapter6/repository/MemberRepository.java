package com.dogyun.chapter6.repository;

import com.dogyun.chapter6.domain.Member;

import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, String> {
    
}
