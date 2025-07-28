<%-- 
    Document   : index
    Created on : Jul 28, 2025, 9:53:10 AM
    Author     : 20113
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Upload Email</title>
    </head>
    <body>
        <form action="upload" method="post" enctype="multipart/form-data">
            Tên đăng nhập: <input type="text" name="username" /><br/>
            Email: <input type="text" name="email" /><br/>
            Chọn ảnh đại diện: <input type="file" name="avatar" /><br/>
            <input type="submit" value="Gửi" />
        </form>
    </body>
</html>
