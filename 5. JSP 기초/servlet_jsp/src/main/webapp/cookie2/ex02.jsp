<%@ page contentType = "text/html; charset=UTF-8" %>
<%
    Cookie cookie = new Cookie("key3", "value3");

    // Path 설정(상위로 설정하면 쿠키 사용이 가능한 범위가 넓어짐)
    // 하지만 이 경우 바뀔 수 있는 경로이므로 사용 지양
    // cookie.setPath("/servlet_jsp");

    // Path를 설정하고 싶을 땐 아래와 같이.
    cookie.setPath(request.getContextPath());

    response.addCookie(cookie);
%>