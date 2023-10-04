<%--
  Created by IntelliJ IDEA.
  User: rmukhop2
  Date: 01/10/23
  Time: 4:25 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTI-8">
    <title>Login to Welcome JSP</title>
</head>
<body>
<form action="/spring-mvc/login" method="Post">
    Name: <input type="text" name="name"/>
    Password: <input type="text" name="password"/>
    <input type="Submit"/>
</form>
</body>
</html>
