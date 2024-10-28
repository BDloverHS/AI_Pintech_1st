package org.koreait.member.templates;

import org.koreait.global.Template;

/**
 * 상품 등록 양식 출력
 *
 */
public class MemberForm implements Template {
    @Override
    public void print() {
        StringBuffer sb = new StringBuffer();
        sb.append("유저 등록 안내 작성...");
        System.out.println(sb);
    }
}
