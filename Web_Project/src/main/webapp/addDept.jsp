<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<body>
	<h2>Department Entry Form</h2>
	<form action ="buildDept.jsp" method="post">
	<pre>
	<h2>Dept No:</h2>
	<input type = "text" name="deptNo">
	
	<h2>Name:</h2>
	<input type = "text" name="name">
	
	<h2>Location:</h2>
	<select name="loc">
	<option>SELECT</option>
	<option value = "New Delhi">New Delhi</option>
	<option value = "Mumbai">Mumbai</option>
	<option value = "Pune">Pune</option>
	<option value = "Nashik">Nashik</option>
	<option value = "London">London</option>
	</select>
	<input type="submit" value="ADD">
	</pre>
	</form>

	</body>
</html>