package org.koreait.member.templates;

import org.koreait.global.Model;
import org.koreait.global.Template;
import org.koreait.global.libs.Utils;
import org.koreait.member.entities.Member;

import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * 상품 목록 템플릿
 *
 */
public class MemberList implements Template {

    private List<Member> users;

    @Override
    public void print() {
        System.out.println("상품목록");
        Utils.drawLine('-', 30);
        if (users != null && !users.isEmpty()) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
            for (Member user : users) {
                System.out.printf("상품번호: %d / 상품명: %s / 판매가: %d원 / 등록일: %s%n", user.getSeq(), user.getName(), user.getPrice(), formatter.format(user.getRegDt()));
            }
            return;
        }

        System.out.println("등록된 상품이 없습니다.");
    }

    @Override
    public void print(Model model) {
        Object data = model.getData();
        if (data != null) {
            users = (List<Member>)data;
        }

        print();
    }
}
