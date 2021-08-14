package com.dogyun.chapter6.service;

import java.util.Optional;

import com.dogyun.chapter6.domain.Member;
import com.dogyun.chapter6.repository.MemberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member getMember(Member member) {
        Optional<Member> findMember = memberRepository.findById(member.getId());
        if (findMember.isPresent()) {
            return findMember.get();
        } else {
            return null;
        }
    }

    

}
