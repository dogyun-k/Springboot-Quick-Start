package com.dogyun.chapter7.repository;

import com.dogyun.chapter7.domain.Member;

import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, String> {
    
}
