<%-- 
    Document   : idAlreadyExists
    Created on : Nov 28, 2018, 2:28:59 PM
    Author     : AJuda
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ID Exists</title>
    </head>
    <body>
        <h2>Employee with such id already exists</h2>
        <form:form action="dispEmployee" method="post">
            <button name="CRUDEmployee" type="submit">Return</button>
        </form:form>
    </body>
</html>
