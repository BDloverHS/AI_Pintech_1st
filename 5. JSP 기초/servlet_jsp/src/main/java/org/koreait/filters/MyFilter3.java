package org.koreait.filters;

import jakarta.servlet.*;

import java.io.IOException;

public class MyFilter3 implements Filter {

    // 최초 객체 생성 시 단 1번 호출
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String key1 = filterConfig.getInitParameter("key1");
        String key2 = filterConfig.getInitParameter("key2");
        System.out.printf("key1 = %s%n", key1);
        System.out.printf("key2 = %s%n", key2);
    }

    // 매 요청마다 호출
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 요청 처리 전 공통 처리 코드를 여기 정의하는 것은 지양

        System.out.println("MyFilter3 - 요청 전"); // 요청 처리 전 공통 처리 부분


        chain.doFilter(request, response);
        // 요청 처리 후 공통 처리 코드를 여기 정의하는 것은 지양

        System.out.println("MyFilter3 - 응답 후"); // 응답 후 공통 처리 부분
    }

    // 소멸 직전 단 1번 호출
    @Override
    public void destroy() {
        System.out.println("MyFilter3 - destroy()");
    }
}
