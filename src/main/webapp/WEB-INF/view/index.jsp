<%--
  Created by IntelliJ IDEA.
  User: Hadi
  Date: 1/6/2022
  Time: 10:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fr" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> Hi Hadi To Spring Security</h1>
<hr/>
<fr:form action="logout" method="post">
    <input type="submit" value="Logout">
</fr:form>
</body>
</html>
