<%-- 
    Document   : Register
    Created on : 1 Oct, 2024, 9:27:09 AM
    Author     : srija singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Your Book</title>
    </head>
    <body>
        <form action="BookServlet" method="post">
            Book ID <input type="number"  name="n1"><br>
            Name<input type="text"  name="n2"><br>
            Author Name <input type="text"  name="a1"><br>
            Category <input type="text"  name="c1"><br>
            <input type="submit">
            <input type="reset">
        </form>
    </body>
</html>
 