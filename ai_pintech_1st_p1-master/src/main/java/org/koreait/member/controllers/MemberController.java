package org.koreait.member.controllers;

import org.koreait.global.BeanContainer;
import org.koreait.global.Controller;
import org.koreait.global.Router;
import org.koreait.global.libs.Utils;
import org.koreait.member.entities.Member;
import org.koreait.member.services.MemberSaveService;
import org.koreait.member.templates.MemberForm;

import java.util.Scanner;

/**
 * 상품 등록/수정 컨트롤러
 *
 */
public class MemberController extends Controller {

    public MemberController() {
       setPromptProcess(() -> {
           Utils.drawLine('-', 30);

           Scanner sc = Router.sc;
           Member user = new Member();

           // 유저 아이디
           String id = Utils.getString("유저 아이디", "사용하실 아이디를 입력하세요.");
           user.setUserId(id);

           // 유저 비번
           String pass = Utils.getString("유저 비밀번호", "사용하실 비밀번호를 입력하세요.");
           user.setUserPass(pass);

           // 유저 이름
           String name = Utils.getString("유저 이름", "이름을 입력하세요.");
           user.setUserName(name);

           // 유저 생일
           String birth = Utils.getString("유저 생일", "생일을 입력하세요.(6자리)");
           user.setUserBirth(birth);

           // 유저 이메일
           String email = Utils.getString("유저 아이디", "사용하실 아이디를 입력하세요.");
           user.setUserEmail(email);

           // 상품 정보 저장 처리
           MemberSaveService saveService = BeanContainer.getBean(MemberSaveService.class);
           saveService.save(user);

           System.out.println("저장되었습니다.");
           // 저장 이후에 상품 목록으로 페이지 이동
           
           Utils.loadController(MemberListController.class);
       });
    }

    @Override
    protected String getPromptText() {
        return "등록할 상품 정보를 입력하세요(메인 메뉴: M, 종료: Q).\n";
    }

    @Override
    public void view()  {
        Utils.loadTpl(MemberForm.class);
    }
}
