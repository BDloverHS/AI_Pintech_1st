package org.koreait.member.exceptions;

import org.koreait.global.exceptions.CommonException;

/**
 * 상품 정보가 없는 경우 발생하는 예외
 *  상품이 없는 경우 사용자에게 출력되는 메세지는 특별하게 다를 것도 없다. 따라서 기본 생성자로 정의하고 다음과 같이 메세지와 예외 코드는 고정한다.
 */
public class MemberNotFoundException extends CommonException {
    public MemberNotFoundException() {
        super("사용자를 찾을 수 없습니다.", 404);
    }
}
