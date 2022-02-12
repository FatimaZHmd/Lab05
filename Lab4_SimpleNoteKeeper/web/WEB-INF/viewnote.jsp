<%-- 
    Document   : viewnote
    Created on : Feb 10, 2022, 6:44:50 PM
    Author     : zahra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <form action="note" method="post">
            <label>Title</label> <br>
            <input type="text" name="title" value="${note.title}"> <br>
                
                     
            <label>Content:</label> <br>
            <input type="text" name="contents" value="${note.contents}">  <br>
           
            <p><a href="note?edit">Edit</a></p>
        </form>
    </body>
</html>
