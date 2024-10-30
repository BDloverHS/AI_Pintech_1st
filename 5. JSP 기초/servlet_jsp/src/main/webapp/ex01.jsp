<%@ page contentType='text/html; charset=UTF-8' %>

<%-- JSP 주석입니다. JSP가 서블릿 클래스로 번역될 때 번역 배제 --%>
<%
    // _jspService() 내부에 번역
    int num1 = 100; // 지역 변수
    int num2 = 200; // 지역 변수
    out.write(num1 + num2);
    out.write("<h1>" + message + "</h1>");
    PrintMessage();
%>

<%!
    // 스크립트 태그에 !를 붙이면 선언문이 된다.
    String message = "안녕하세요."; // 인스턴스 변수

    void PrintMessage() {
        System.out.println(message);
    }
%>