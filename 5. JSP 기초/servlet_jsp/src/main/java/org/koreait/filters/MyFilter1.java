package org.koreait.filters;

// 무조건 jakarta.servlet.Filter를 사용하여야 함.
import jakarta.servlet.*;

import java.io.IOException;

public class MyFilter1 implements Filter {
    // doFilter : 필수로 넣어야 함(추상 메서드이기 때문)
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MyFilter1 - 요청 전"); // 요청 처리 전 - 요청 데이터 필터링

        // 다음 필터가 있으면 다음 필터로 호출(request, response 객체 전달과 함께)
        // 다음 필터가 없으면 서블릿 쪽 정의된 요청 메서드(doGET(...), doPost(...)) 호출
        chain.doFilter(request, response);

        System.out.println("MyFilter1 - MyFilter2 응답 후"); // MyFilter2 응답 후 필터링
    }
}
