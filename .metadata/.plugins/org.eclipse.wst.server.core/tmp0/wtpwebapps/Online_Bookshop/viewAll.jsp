<%@page import="com.bookshop.entity.Book"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>All Books</title>
</head>
<body>

<h1>Books Available</h1>

<%
    RequestDispatcher dispatcher = request.getRequestDispatcher("viewBooks");
    dispatcher.include(request, response);
%>

<br><br>

<%
    List<Book> books = (List<Book>) request.getAttribute("books");
    if (books != null && !books.isEmpty()) {
%>
    
    <% for (Book book : books) { %>
    
        <h2>Title: <%= book.getTitle() %>|Author: <%= book.getAuthor().getName() %>|Price: <%=book.getPrice() %>|Publication Year: <%=book.getPublicationYear() %>
        </h2><button>buy</button><br>
    <% } %>
    
<%
    } else {
%>
    <p>No books available.</p>
<%
    }
%>

</body>
</html>
