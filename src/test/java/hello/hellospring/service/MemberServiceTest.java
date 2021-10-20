package hello.hellospring.service;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class MemberServiceTest {

    MemberService memberService = new MemberService();

    @Test
    void 회원가입() {

        // given
        Member member = new Member();
        member.setName("hello");

        // when
        Long saveId = memberService.join(member);

        // then
        Assertions.assertThat()

    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}