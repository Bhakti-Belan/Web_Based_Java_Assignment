<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<body>
	<%--Fetching Session and Application level information --%>
	<%
		Object loggedInUser= session.getAttribute("LogedInUser");
	Object greetingMsg= session.getAttribute("greetingMsg");
	Object companyPolicy = application.getAttribute("ourCompPolicy");
	%>
	<h2><%=greetingMsg %><%=loggedInUser %></h2>
	<h2>This is Our company policy:</h2>
	<h2><%=companyPolicy %></h2>
	</body>
</html>