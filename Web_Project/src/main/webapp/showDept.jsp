<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<body>
	<%--Obtaining the bean of type Department from Session Scope. --%> 
<jsp:useBean id="d1" class="example.jdbc.Department" scope="session"/>
	<%--Showing Properties Value of the bean --%>
	<h2>Dept No: <jsp:getProperty property="deptNo" name="d1"/></h2>
	<h2>name: <jsp:getProperty property="name" name="d1"/></h2>
	<h2>loc: <jsp:getProperty property="loc" name="d1"/></h2>
	</body>
</html>