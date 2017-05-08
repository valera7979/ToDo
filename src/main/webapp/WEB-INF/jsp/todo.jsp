<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<html>
<head>
    <title>ToDo`s</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <meta charset="utf-8">
</head>
<body>

<a href = "/users" title="Home" style = "text-decoration: none">
    <div class="jumbotron text-center" >
        <h1>ToDo`s List</h1>
        <p></p>
    </div>
</a>

<div class="container">
    <!-- Search form-->
    <div class="col-sm-9" >
        <form action="/doSearch" method="post" class="form-inline">
            <input type="text" class="form-control" name="searchString" placeholder="search by name"/>
            <button type="submit" class="btn btn-default">Search</button>
            <input type="reset" class="btn btn-default" value="Cancel"/>
        </form>
    </div>

    <div class="col-sm-2" >
        <!-- Trigger the modal with a button -->
        <button type="button" class="btn btn-success " data-toggle="modal" data-target="#myModal">Add ToDo</button>
    </div>
    <!-- Table of todo`s -->
    <c:if test="${!empty todos}">
    <table class="table table-hover">
        <tr>
            <th>ID</th>
            <th>DESCRIPTION</th>
            <th>STARTED</th>
            <th>EXPIRATION DATE</th>
            <th>STATUS</th>
            <th>EDIT</th>
            <th>DELETE</th>
        </tr>
        <c:forEach var = "todo" items="${todos}">
            <tr>
                <td>${todo.id}</td>
                <td>${todo.description}</td>
                <td>${todo.started}</td>

                <td>${todo.expiration_date}</td>
                <td>${todo.status}</td>
                <td><a class = "open-EditUserDialog btn btn-primary"  data-toggle="modal"
                       data-id = "${todo.id}" data-description="${todo.description}" data-expiration = "${todo.expiration_date}" data-status = "${todo.status}"
                       href="#editModal">Edit</a></td>

                <td><a class = "btn btn-danger" href="<c:url value="/remove/${todo.id}/"/>">Delete</a></td>

            </tr>
        </c:forEach>
    </table>
    </c:if>

</body>
</html>
