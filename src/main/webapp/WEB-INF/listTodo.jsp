<%--
  Created by IntelliJ IDEA.
  User: rmukhop2
  Date: 06/10/23
  Time: 1:21 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>

    <title>Todo List</title>
    <link href="webjars/bootstrap/5.3.2/css/bootstrap.css" rel="stylesheet">
</head>
<body>
Hi ${name}<br/>
<div class="container">
    <caption>Your Todos are</caption>
    <table class="table table-bordered table-striped-columns">
        <thead>
            <tr>
                <th>Id</th>
                <th>User</th>
                <th>Description</th>
                <th>Completed status</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="todos" items="${todo}" >
            <tr>
                <td>${todos.id}</td>
                <td>${todos.user}</td>
                <td>${todos.description}</td>
                <td>${todos.done}</td>
                <td><a href="/spring-mvc/delete_todo?id=${todos.id}" class="btn btn-danger"  >Delete</a></td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
<div><a class="btn btn-success" href="/spring-mvc/add_todo">Add</a></div>

<script src="webjars/jquery/3.3.1/jquery.min.js"></script>
<script src="webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
</body>
</html>
