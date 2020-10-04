<%--
  Created by IntelliJ IDEA.
  User: laster
  Date: 10/3/20
  Time: 2:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <title>Login</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
    <meta name="theme-color" content="#563d6c">

    <style>
        .error { color: #ff0000; }

        .errorblock {
            color: #000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
    <link href="navbar-top.css" rel="stylesheet">
</head>
<body class="container">
    <nav class="navbar navbar-expand-md navbar-dark bg-dark mb-4">
        <a class="navbar-brand" href="#">Get Started</a>
    </nav>
    <div>
        <h1>Login</h1>
    </div>
    <div>
        <c:if test="${not empty param.error}">Invalid username and password.</c:if>
    </div>
    <form:form action="perform_login" method="post">
        <form:errors path="*" cssClass="errorblock" element="div"/>
        <div><label> User Name : <input type="text" name="username"/></label></div>
        <div><label> Password : <input type="password" name="password"/></label></div>
        <input type="submit" class="btn btn-lg btn-primary" role="button" value="Login"/>
    </form:form>
    <div class="control-group">

    </div>
</body>
</html>
