<%-- 
    Document   : agecalculator
    Created on : Feb 4, 2022, 8:12:10 PM
    Author     : zahra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form method="POST" action="age">
            <label>Enter you age:</label>
            <input type="text" name="age" value="${userAge}">
            <br>
            <input type="submit" value="Age next birthday">
            <br>
            <span>${message}</span>
            <br>
            
            
        </form>
            <a href="./arithmetic">Arithmetic Calculator</a>
    </body>
    
</html>
