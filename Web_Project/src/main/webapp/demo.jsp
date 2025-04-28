<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.time.LocalDate, java.time.LocalTime"%>
<!DOCTYPE html>
<html>

<body>
	<h2>Welcome to the demonstration of several JSP tags.</h2>
	<%--Including the Resource: greet.html --%>
	<%@ include file="greet.html" %>
	
	
	<%-- Defining some Method and Variable --%>
	<%!
		int num= 9;
	public String sayGreeting(String name){
		return "Welcome "+ name;
	}
	%>
	
	
	<%--Showing the Square Of Number --%>
	<h2>Square of <%=num %> is <%=(num * num) %></h2>
	
	
	<%--Showing the value return from Method --%>
	<h2><%= sayGreeting("Virat") %></h2>
	
	<%-- printing HELLO 5 times in H2 heading style --%>
	<%
		for(int a=1;a<=5;a++){
	%>
	<h2>HELLO</h2>
	<%
		}
	%>
	
	
	<%--Showing current date and Time using LocalDate and LocalTime --%>
	<%
		LocalDate systemDate = LocalDate.now();
		LocalTime systemTime = LocalTime.now();
	%>
	<h2>Today's date : <%=systemDate %></h2>
	<h2>Today's time : <%=systemTime %></h2>
</body>
</html>






