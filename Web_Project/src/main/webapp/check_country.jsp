<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<body>
		<%--Checking the country of Residence --%>
		<%
		String countryName=request.getParameter("country");
		if(countryName.equals("India")){
			%>
			<jsp:forward page="greet_person.jsp">
			<jsp:param value="Welcome" name="greeting"/>
			</jsp:forward>
			
		<%
			}
		else{
		%>
		<h2>Sorry this Service is not Available in your Country. Try Again...</h2>
		<jsp:include page="person_entry.jsp"/>	
		<%
			}
		%>	
		
	</body>
</html>