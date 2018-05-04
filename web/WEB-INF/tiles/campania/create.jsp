<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<body class="nav-md">
<div class="container body">
    <div class="right_col" role="main">

        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">


                <form:form action="save" modelAttribute="campania" method="post">

                    <div class="row">

                            <div class="col-md-8">
                                <div class="col-md-5">
                                    <div class="form-group label-floating">
                                        <label class="control-label">Nombre</label>
                                        <form:input cssClass="form-control" path="nombre"/>
                                    </div>
                                </div>

                                <div class="col-md-5">
                                    <div class="form-group label-floating">
                                        <label class="control-label">Fecha de Inicio</label>
                                        <form:input cssClass="form-control" path="fechaDeInicio"/>
                                    </div>
                                </div>


                                <div class="col-md-5">
                                    <div class="form-group label-floating">
                                        <label class="control-label">Fecha de Fin</label>
                                        <form:input cssClass="form-control" path="fechaDeFin"/>
                                    </div>
                                </div>
                        </div>

                        <div class="col-md-4">

                            <c:forEach items="${encuestas}" var="bo" varStatus="status">

                                <li>
                                    <form:checkbox path="encuestas[${status.index}].idGoogle" value="${bo.id}"/>
                                        <a href="${bo.originalFilename}" target="_blank">${bo.name}</a>
                                </li>

                            </c:forEach>

                        </div>

                    </div>

                    <div class="col-xs-2">
                        <button type="submit" class="btn btn-block btn-primary">Guardar</button>
                    </div>

                </form:form>


            </div>
        </div>
        <br>

    </div>
</div>
</body>