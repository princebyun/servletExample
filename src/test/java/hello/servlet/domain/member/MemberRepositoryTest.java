package hello.servlet.domain.member;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance();


    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }


    @Test
    void save(){
        //given

        //when

        //then
    }





}
