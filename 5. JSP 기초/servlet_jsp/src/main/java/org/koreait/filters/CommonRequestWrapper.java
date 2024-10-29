package org.koreait.filters;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

public class CommonRequestWrapper extends HttpServletRequestWrapper {
    public CommonRequestWrapper(ServletRequest request) {
        super((HttpServletRequest) request);

        // 요청 시 공통 처리 코드....
        System.out.println("요청 공통 코드 처리...");
    }

    @Override
    public String getParameter(String name) {

        String value = super.getParameter(name);
        if (value != null || value.isBlank()) {
            value = String.format("**%s**", value);
        }
        return value;
    }
}
