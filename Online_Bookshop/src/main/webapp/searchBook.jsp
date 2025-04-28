<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style type="text/css">
#box {
	margin: auto;
	width: 400px;
	height: auto;
	border: 2px solid red
}
</style>

<body>
<div id="box">
<h1>Enter Book Title:</h1>
<form action="searchBook" method="post">
<h2> Title:<input type="text" name="title">
<input type="submit" value="search">
</h2>
</form>
</div>

</body>
</html>