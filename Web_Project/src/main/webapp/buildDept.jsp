<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<%--Building a java Bean of type : example.jdbc.Department
and Putting it into session scope. --%>
<jsp:useBean id="d1" class="example.jdbc.Department" scope="session"/>

<%--Assigning values to all the properties to the bean --%>
<jsp:setProperty property="*" name="d1"/>
<h2>Department Created Sucessfully.</h2>
<h2>To view, <a href="showDept.jsp"> Click Here</a></h2>
</body>
</html>