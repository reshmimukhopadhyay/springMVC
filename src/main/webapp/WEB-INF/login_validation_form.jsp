<%--
  Created by IntelliJ IDEA.
  User: rmukhop2
  Date: 02/10/23
  Time: 5:30 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<form action= "/loginPage" method="Post">
    <p>${errorMessage}</p>
  Name: <input type="text" name="name"/>  Password: <input type="password" name="password"/>
  <input type="Submit"/>
</form>
</body>
</html>
