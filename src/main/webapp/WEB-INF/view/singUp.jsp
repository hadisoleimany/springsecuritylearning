<%--
  Created by IntelliJ IDEA.
  User: Hadi
  Date: 1/8/2022
  Time: 11:47 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fr" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register User</title>
</head>
<body>
<div style="text-align: center;">
    <fr:form method="post" action="register" modelAttribute="userDto">
        <fr:input path="userName"/>
        <br>
        <br>
        <fr:password path="password"/>
        <br>
        <br>
        <input type="submit" value="Register">
    </fr:form>
</div>
</body>
</html>
