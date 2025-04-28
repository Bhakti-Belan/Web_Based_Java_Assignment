<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<body>
		<%
			String personName = request.getParameter("name");
			String greetingMsg = request.getParameter("greeting");
		%>\
		<h2><%=greetingMsg %><%= personName %></h2>
	</body>
</html>