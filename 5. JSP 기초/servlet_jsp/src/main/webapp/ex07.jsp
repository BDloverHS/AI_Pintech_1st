<%@ page contentType="text/html; charset=UTF-8" %>
<jsp:include page="outlines/header.jsp">
    <%-- 요청 데이터 버퍼 추가. 데이터가 header 안으로 들어감. --%>
    <jsp:param name="key1" value="value1" />
    <jsp:param name="key2" value="value2" />
</jsp:include>

<main>
    <h1>메인 영역</h1>
</main>

<jsp:include page="outlines/footer.jsp" />