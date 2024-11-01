<%@ page contentType = "text/html; charset=UTF-8" %>
<%
    Cookie cookie = new Cookie("key4", "value4");
    // MaxAge를 0으로 설정하면 쿠키 삭제를 의미한다.
    cookie.setMaxAge(0); // 1970.1.1 00:00:00 GMT
    response.addCookie(cookie);
%>