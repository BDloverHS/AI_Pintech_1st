package org.koreait.member.controllers;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class LoginController extends HttpServlet {

    // private ~~ -> 사용 지양

    // 최초 생성 시 한 번만 실행
    @Override
    public void init(ServletConfig config) throws ServletException {
        // ServletConfig의 주요 메서드 : 설정값 조회 메서드
        // String getInitParameter(String name);
        String key1 = config.getInitParameter("key1");
        String key2 = config.getInitParameter("key2");
        System.out.printf("key1=%s%n", key1);
        System.out.printf("key2=%s%n", key2);
    }
    /*
    public void init() throws ServletException {
        System.out.println("서블릿 객체가 생성되면 최초 1번 실행");
        // 설정 값을 최초 한 번 조회. 서블릿 객체 내에서 유지. 최초 유입 로그
    }
    */

    // 서블릿 개게 소멸 직전 1번만 실행
    @Override
    public void destroy() {
        System.out.println("서블릿 객체가 소멸되기 직전에 1번만 실행");
        // 공통 자원 해제, 로그 기록
    }

    @Override
    // TOMCAT에서 받은 정보
    // req : 요청을 담음. resp : 응답을 담음.
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet()");
        // resp.setContentType("text/html"); // 응답 헤더 text/html
        // resp.setCharacterEncoding("UTF-8");
        // 위 2개의 코드를 하나로 합침
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.write("<h1>로그인</h1>");

    }
}