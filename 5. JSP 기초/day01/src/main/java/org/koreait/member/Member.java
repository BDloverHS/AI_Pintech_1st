package org.koreait.member;

import lombok.*;

// @Setter @Getter @ToString
// 어노테이션 3개를 쓰기 귀찮을 때
// Data 어노테이션 안에는 위 세 개의 어노테이션이 포함됨(+@EqualsAndHashCode)
@Data
// @NoArgsConstructor(access = AccessLevel.PRIVATE) → private 생성자
// @AllArgsConstructor()
// @RequiredArgsConstructor
@Builder
@ToString
public class Member {
    private long seq; // 회원번호
    private final String email; // 이메일
    // @NonNull
    // ToString에서 특정 데이터 출력 배제
    // @ToString.Exclude
    private String password; // 비밀번호
}
