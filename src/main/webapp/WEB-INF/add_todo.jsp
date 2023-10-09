<%--
  Created by IntelliJ IDEA.
  User: rmukhop2
  Date: 07/10/23
  Time: 4:20 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

    <head>
        <title>Add todo page</title>
        <link href="webjars/bootstrap/5.3.2/css/bootstrap.css" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <h1>Add a Todo</h1>
            <form  method="Post">
                <fieldset class="form-group">
                    <label>Username</label>
                    <input name="user" type="text" class="form-control" required="required"/>
                </fieldset>

                    <input class ="btn btn-success" type="submit" value="Add"/>
            </form>
        </div>
        <script src="webjars/jquery/3.3.1/jquery.min.js"></script>
        <script src="webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
    </body>

</html>
