<%-- 
    Document   : result
    Created on : Jul 28, 2025, 9:53:57 AM
    Author     : 20113
--%>

<%@ page import="com.mycompany.webuploademail.model.User" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kết quả</title>
    </head>
    <body>
        <%
            User user = (User) request.getAttribute("user");
        %>
        <p>Tên: <%= user.getUsername() %></p>
        <p>Email: <%= user.getEmail() %></p>
        <img src="<%= user.getAvatar() %>" width="150"/>
    </body>
</html>
