<%-- 
    Document   : addEmployee
    Created on : Nov 22, 2018, 11:13:10 AM
    Author     : AJuda
--%>
<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Spring5 edit employee</title>
        <style type="text/css">
            .error {
                color: red;
            }
            table {
                width: 50%;
                border-collapse: collapse;
                border-spacing: 0px;
            }
            table td {
                border: 1px solid #565454;
                padding: 20px;
            }
        </style>
    </head>
    <body>
        <h1>Edit Form</h1>
        <form:form action="editEmployee" method="post" modelAttribute="user">
            <table>
                <tr>
                    <td>User Id</td>
                    <td>
                        <form:input path="id" /> <br />
                    </td>
                </tr>
                <tr>
                    <td>First Name</td>
                    <td>
                        <form:input path="firstName" /> <br />
                    </td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td>
                        <form:input path="lastName" /> <br />
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <button type="submit" style="float: left;">
                            Submit
                        </button>
                        <button type="submit" formaction="dispEmployee" 
                                name="CRUDEmployee" style="float: right;">
                            Return
                        </button>
                    </td>
            </table>
        </form:form>
    </body>
</html>
