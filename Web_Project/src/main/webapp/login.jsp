<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>

	<body>
		<h2>Login Page</h2>
		<form action="doLogin" method="post">
		<pre>
			<h2>UserName: </h2>
			<input type = "text" name="userName"/>
			
			<h2>Password: </h2>
			<input type = "password" name="password"/>
			
				
			<input type = "submit" name="Sign-In"/>
		</pre>
		</form>
	</body>
</html>