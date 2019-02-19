<%-- 
    Document   : employeesListDisplay
    Created on : Nov 19, 2018, 1:13:36 PM
    Author     : AJuda
--%>
<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Spring MVC Hello World</title>
    </head>
    <body>
        <h2>Spring5 All Employees in System</h2>
        <form:form id="disp" name="display" action="dispEmployee" method="post">
            <table border="1">
                <tr>
                    <th>Employee Id</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                </tr>
                <c:forEach items="${employees}" var="employeeList">
                    <tr>
                        <td align="center">${employeeList.id}</td>
                        <td align="center">${employeeList.firstName}</td>
                        <td align="center">${employeeList.lastName}</td>
                        <td>
                            <button type="submit" name="editButton" 
                                    value="${employeeList.id}" formaction="editThisEmployee">
                                Edit
                            </button>
                        </td>
                    </tr>
                </c:forEach>
                <tr>
                    <td>
                        <button type="submit" name="CRUDEmployee" value="add">
                            Add employee
                        </button>
                    </td>
                    <td>
                        <button type="submit" name="CRUDEmployee" value="edit">
                            Edit employee
                        </button>
                    </td>
                    <td>
                        <button type="submit" name="CRUDEmployee" value="remove">
                            Remove employee
                        </button>
                    </td>
                </tr>
            </table>
        </form:form>
    </body>
</html>