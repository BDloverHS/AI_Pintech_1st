package org.koreait.member.controllers;

import org.koreait.global.BeanContainer;
import org.koreait.global.Controller;
import org.koreait.global.Model;
import org.koreait.global.libs.Utils;
import org.koreait.global.validators.RequiredValidator;
import org.koreait.global.validators.TypeValidator;
import org.koreait.member.entities.Member;
import org.koreait.member.services.MemberInfoService;
import org.koreait.member.templates.MemberList;

import java.util.List;

/**
 * 상품 목록
 *  - 상품목록에서 상품 번호를 입력하면 상품 상세보기로 이동
 *
 */
public class MemberListController extends Controller implements TypeValidator, RequiredValidator {
    public MemberListController() {
        setInputProcess(input -> {
            /* 유효성 검사 S */
            if (!check(input)) { // 필수 항목 체크
                return;
            }

            if (!isNumber(input)) {
                System.out.println("상품 번호는 숫자만 입력하세요.");
                return;
            }

            /* 유효성 검사 E */

            // 선택한 상품 번호와 함께 상품 상세로 이동
           Utils.loadController(MemberViewController.class, new Model(Long.parseLong(input)));


        });
    }

    @Override
    protected String getPromptText() {
        return "조회할 상품번호를 입력하세요(메인메뉴: M, 종료: Q):";
    }

    @Override
    public void view() {
        MemberInfoService service = BeanContainer.getBean(MemberInfoService.class);
        List<Member> items = service.getList();

        // 템플릿 로드 및 상품 목록 데이터 전송
        Utils.loadTpl(MemberList.class, new Model(items));
    }
}
