package org.koreait.member.controllers;

import org.koreait.global.BeanContainer;
import org.koreait.global.Controller;
import org.koreait.global.Model;
import org.koreait.global.libs.Utils;
import org.koreait.member.entities.Member;
import org.koreait.member.exceptions.MemberNotFoundException;
import org.koreait.member.services.MemberInfoService;
import org.koreait.member.templates.MemberView;

/**
 * 상품 상세 보기
 *
 */
public class MemberViewController extends Controller {

    @Override
    public void view() {
        Object data = getData();
        if (data == null) {
            throw new MemberNotFoundException();
        }

        long seq = (long)data; // 상품번호
        MemberInfoService service = BeanContainer.getBean(MemberInfoService.class);

        Member item = service.get(seq);

        // 상품 정보와 함께 출력
        Utils.loadTpl(MemberView.class, new Model(item));
    }
}
