<%@ page contentType="text/html; charset=UTF-8" %>
<h1>안녕하세요.</h1>
<h2>번역 위치 _jsp.java 파일 내 _jspService() 메서드 내부에 주로 번역</h2>
<!--
이
것
도

주
석?
-->

// 이건 주석 안 됨
<%
    // ＜% %＞ 안에는 자바 언어를 사용할 수 있다.
    // 스크립틀릿 태그 - _jspService() 메서드 내부에 주로 번역
    System.out.println(request);
    System.out.println(response);
    String value = request.getParameter("key1");
    System.out.println(value);
%>

<%
    int num1 = 100;
%>