<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html lang="en">
<head>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Meta, title, CSS, favicons, etc. -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title> <tiles:insertAttribute name="title" /></title>

        <!-- Bootstrap -->
        <link href="/sie/resources/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
        <!-- Font Awesome -->
        <link href="/sie/resources/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
        <!-- NProgress -->
        <link href="/sie/resources/vendors/nprogress/nprogress.css" rel="stylesheet">
        <!-- Animate.css -->
        <link href="/sie/resources/vendors/animate.css/animate.min.css" rel="stylesheet">

        <!-- Custom Theme Style -->
        <link href="/sie/resources/build/css/custom.min.css" rel="stylesheet">
    </head>

</head>

    <tiles:insertAttribute name="body" />