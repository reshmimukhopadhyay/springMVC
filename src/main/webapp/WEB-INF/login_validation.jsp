<%--
  Created by IntelliJ IDEA.
  User: rmukhop2
  Date: 02/10/23
  Time: 5:27 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
Welcome ${name}<br/>
Now,you can manage <a href="/spring-mvc/list_todo?name=${name}">manage your todos</a>
</body>
</html>
