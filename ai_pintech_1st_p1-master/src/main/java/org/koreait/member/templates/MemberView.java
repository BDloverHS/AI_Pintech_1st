package org.koreait.member.templates;

import org.koreait.global.Model;
import org.koreait.global.Template;
import org.koreait.member.entities.Member;

/**
 *유저 상세 보기 출력
 *
 */
public class MemberView implements Template {

    private Member user;

    @Override
    public void print() {
        System.out.println("상품 상세...");
        System.out.println(user);
    }

    @Override
    public void print(Model model) {

        Object data = model.getData();
        if (data != null) {
            user = (Member)data;
        }

        print();
    }
}
