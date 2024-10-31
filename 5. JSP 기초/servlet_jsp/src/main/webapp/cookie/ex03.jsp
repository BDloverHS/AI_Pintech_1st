<%@ page contentType = "text/html; charset=UTF-8" %>
<%
    Cookie cookie = new Cookie("key4","value4");
    // 쿠키의 최대 수명 설정
    // 초 * 분 * 시간 * 일수(관례)
    cookie.setMaxAge(60 * 60 * 24 * 7);

    // 브라우저에서 서버 쪽으로 넘겨줄 때만 정보를 볼 수 있음
    // 민감한 정보를 숨김
    // 보안상에 유리
    cookie.setHttpOnly(true);
    response.addCookie(cookie);
%>