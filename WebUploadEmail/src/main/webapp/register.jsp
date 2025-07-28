<%-- 
    Document   : register
    Created on : Jul 28, 2025, 9:53:26 AM
    Author     : 20113
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng ký</title>
    </head>
    <body>
        <form action="register" method="post">
            Email: <input type="text" name="email" /><br/>
            <input type="submit" value="Đăng ký và nhận Email" />
        </form>
        <p>${message}</p>
    </body>
</html>
