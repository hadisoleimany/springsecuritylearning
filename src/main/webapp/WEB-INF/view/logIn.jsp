<%--
  Created by IntelliJ IDEA.
  User: Hadi
  Date: 1/8/2022
  Time: 12:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fr" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Custom Login Page</title>
</head>
<body>
<div style="text-align: center;">
    <c:if test="${param.error != null}" >
        <i style="color: red"> Invalid Username or Password</i>
    </c:if>
    <fr:form>
        <h1>LogIn</h1>
        <hr/>
        <label>
            Username : <input type="text" name="username" placeholder="User Name">
        </label>
        <br>
        <br>
        <label>
            Password : <input type="password" name="password" placeholder="Password">
        </label>
        <br>
        <br>
        <input type="submit" value="LogIn" name="LogIn">
    </fr:form>
</div>
</body>
</html>
