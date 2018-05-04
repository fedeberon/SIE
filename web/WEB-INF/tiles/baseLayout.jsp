<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html lang="en">
<head>

    <tiles:insertAttribute name="header" />

</head>

<body class="nav-md">
<div class="container body">

    <div class="main_container">

        <tiles:insertAttribute name="menu" />

        <tiles:insertAttribute name="body" />

        <tiles:insertAttribute name="footer" />


    </div>
</div>

<!-- jQuery -->
<script src="<c:url value="/resources/vendors/jquery/dist/jquery.min.js"/>"></script>
<!-- Bootstrap -->
<script src="<c:url value="/resources/vendors/bootstrap/dist/js/bootstrap.min.js"/>"></script>
<!-- FastClick -->
<script src="<c:url value="/resources/vendors/fastclick/lib/fastclick.js"/>"></script>
<!-- NProgress -->
<script src="<c:url value="/resources/vendors/nprogress/nprogress.js"/>"></script>
<!-- Chart.js -->
<script src="<c:url value="/resources/vendors/Chart.js/dist/Chart.min.js"/>"></script>
<!-- gauge.js -->
<script src="<c:url value="/resources/vendors/gauge.js/dist/gauge.min.js"/>"></script>
<!-- bootstrap-progressbar -->
<script src="<c:url value="/resources/vendors/bootstrap-progressbar/bootstrap-progressbar.min.js"/>"></script>
<!-- iCheck -->
<script src="<c:url value="/resources/vendors/iCheck/icheck.min.js"/>"></script>
<!-- Skycons -->
<script src="<c:url value="/resources/vendors/skycons/skycons.js"/>"></script>
<!-- Flot -->
<script src="<c:url value="/resources/vendors/Flot/jquery.flot.js"/>"></script>
<script src="<c:url value="/resources/vendors/Flot/jquery.flot.pie.js"/>"></script>
<script src="<c:url value="/resources/vendors/Flot/jquery.flot.time.js"/>"></script>
<script src="<c:url value="/resources/vendors/Flot/jquery.flot.stack.js"/>"></script>
<script src="<c:url value="/resources/vendors/Flot/jquery.flot.resize.js"/>"></script>
<!-- Flot plugins -->
<script src="<c:url value="/resources/vendors/flot.orderbars/js/jquery.flot.orderBars.js"/>"></script>
<script src="<c:url value="/resources/vendors/flot-spline/js/jquery.flot.spline.min.js"/>"></script>
<script src="<c:url value="/resources/vendors/flot.curvedlines/curvedLines.js"/>"></script>
<!-- DateJS -->
<script src="<c:url value="/resources/vendors/DateJS/build/date.js"/>"></script>
<!-- JQVMap -->
<script src="<c:url value="/resources/vendors/jqvmap/dist/jquery.vmap.js"/>"></script>
<script src="<c:url value="/resources/vendors/jqvmap/dist/maps/jquery.vmap.world.js"/>"></script>
<script src="<c:url value="/resources/vendors/jqvmap/examples/js/jquery.vmap.sampledata.js"/>"></script>
<!-- bootstrap-daterangepicker -->
<script src="<c:url value="/resources/vendors/moment/min/moment.min.js"/>"></script>
<script src="<c:url value="/resources/vendors/bootstrap-daterangepicker/daterangepicker.js"/>"></script>
<!-- Custom Theme Scripts -->
<script src="<c:url value="/resources/build/js/custom.min.js"/>"></script>

</body>
</html>