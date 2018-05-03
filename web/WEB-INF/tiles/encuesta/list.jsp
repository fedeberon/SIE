<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Documentos de Google Drives.</title>
</head>
<body>
<div class="row">
    <div class="col-md-12 col-sm-12 col-xs-12">

        <c:forEach items="${files}" var="file">
            <tr>
                <td>${file}</td>
            </tr>
        </c:forEach>
    </div>
</div>
</body>
</html>
