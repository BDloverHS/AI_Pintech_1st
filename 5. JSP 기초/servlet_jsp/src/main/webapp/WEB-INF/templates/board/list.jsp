<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<table border='1'>
    <thread>
        <tr>
            <th>번호</th>
            <th>제목</th>
            <th>내용</th>
            <th>작성자</th>
        </tr>
    </thread>
    <tbody>
        <c:forEach var="item" items="${items}">
            <tr>
                <td>${item.seq}</td>
                <td>${item.subject}</td>
                <td>${item.content}</td>
                <td>${item.poster}</td>
            </tr>
        <%--
            <tr>
                <td>${item.getSeq()}</td>
                <td>${item.getSubject()}</td>
                <td>${item.getContent()}</td>
                <td>${item.getPoster()}</td>
            </tr>
        --%>
        </c:forEach>
    </tbody>
</table>
${pageContext.getRequest().getRequestURI()}<br>
${pageContext.getRequest().requestURI}


<%--
${items[0]}<br>
${items[1]}<br>
${items[2]}<br>
${items[3]}<br>
${items[4]}<br>
${items[5]}<br>
${items[6]}<br>
${items[7]}<br>
${items[8]}<br>
${items[9]}<br>
--%>