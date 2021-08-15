package com.dogyun.chapter7;

import com.dogyun.chapter7.domain.Member;
import com.dogyun.chapter7.domain.Role;
import com.dogyun.chapter7.repository.MemberRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.access.method.P;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Commit;

@SpringBootTest
@Commit
public class PasswordEncoderTest {
    
    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private PasswordEncoder encoder;

    @Test
    public void testInsert(){
        Member member = new Member();

        member.setId("manager2");
        member.setPassword(encoder.encode("manager123"));
        member.setName("매니저2");
        member.setRole(Role.ROLW_MANAGER);
        member.setEnabled(true);
        memberRepository.save(member);
    }
}
