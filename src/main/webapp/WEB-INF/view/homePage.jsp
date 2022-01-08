<%--
  Created by IntelliJ IDEA.
  User: Hadi
  Date: 1/9/2022
  Time: 2:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fr" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<sec:authorize access='hasAuthority("USER")'><p>User</p></sec:authorize>
<sec:authorize access='hasAuthority("ADMIN")'><p>Admin</p></sec:authorize>


</body>
</html>
