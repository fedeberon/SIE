<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Documentos de Google Drives.</title>
</head>
<body>

    <c:forEach items="${files}" var="file">
        <tr>
            <td>${file}</td>
        </tr>
    </c:forEach>

</body>
</html>
