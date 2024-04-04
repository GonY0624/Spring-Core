package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public Account account(){

        return new PersonalAccount(10, "0104936-9948");

    }

    @Bean
    public MemberDTO member(){
//
//        /* 생성자를 통한 주입 */
//        return new MemberDTO(1, "정고은", "010-4936-9948", "email", account());

        /* setter 주입 */
        MemberDTO member = new MemberDTO();
        member.setSequence(1);
        member.setName("정고은");
        member.setPhone("010");
        member.setEmail("123");
        member.setPersonalAccount(account());

        return member;
    }

}
