package com.dogyun.chapter5.repository;

import com.dogyun.chapter5.domain.Member;

import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, String> {
    
}
