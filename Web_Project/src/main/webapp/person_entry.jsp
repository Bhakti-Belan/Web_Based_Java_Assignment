<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<body>
		<h2>Enter Your Details:</h2>
		<form action="check_country.jsp" method="post">
			<pre>
				<h2>Name: </h2>
				<input type="text" name="name"/>
				
				<h2>Country of Residance: </h2>
				<input type="text" name="country"/>
				
				<input type="submit" value="Submit"/>		
			</pre>
		</form>
	</body>
</html>