package exam01;

import org.junit.jupiter.api.Test;
import org.koreait.member.Member;

public class Ex01 {
    @Test
    void test1() {
        // @AllArgsConstructor() : 모든 인스턴스 변수 생성자 매개변수로 생성

        /*
        // @AllArgsConstructor() 추가 전
        Member member = new Member();
        member.setSeq(1L);
        member.setEmail("user01@test.org");
        member.setPassword("12345678");
         */

        // @AllArgsConstructor() 추가 후
        // Member member = new Member(1L, "user01@test.org","12345678");

        // @RequiredArgsConstructor 추가 후
        // Member member = new Member("user01@test.org","12345678");

        // System.out.println(member);
    }

    @Test
    void test2() {
        Member member = Member.builder()
                                .seq(1L)
                                .email("user01@test.org")
                                .password("12345678")
                                .build();
        System.out.println(member);
    }
}
