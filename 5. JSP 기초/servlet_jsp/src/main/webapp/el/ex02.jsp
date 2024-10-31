<%@ page contentType="text/html; charset=UTF-8" %>
<%
    pageContext.setAttribute("num1",100);
    request.setAttribute("num1",200);
    application.setAttribute("num1", 300);

    pageContext.setAttribute("num2",200);
%>

<%-- 변수가 같으면 속성값의 유지 범위가 좁은 것이 우선순위가 높다. --%>
<%-- 순서 : pageContext < request < session < application --%>
${num1}<br><br><br><br>

<%-- 만약 다른 범위를 출력하고 싶다면? --%>
pageScope.num1 : ${pageScope.num1}<br>
requestScope.num1 : ${requestScope.num1}<br>
applicationScope.num1 : ${applicationScope.num1}<br>

<%--
${num1}<br>
${num2}<br>
${num1 + num2}<br>
--%>