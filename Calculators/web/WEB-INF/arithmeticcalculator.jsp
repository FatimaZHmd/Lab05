<%-- 
    Document   : arithmeticcalculator
    Created on : Feb 4, 2022, 8:47:22 PM
    Author     : zahra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" >
            <label>First:</label>
            <input type="text" name="fNum" value=${fNum}>
            <br>
            
             <label>Second:</label>
            <input type="text" name="sNum" value=${fname}>
            <br>
            
            <input type="submit" value="+" name="oper">
             <input type="submit" value="-" name="oper">
              <input type="submit" value="*" name="oper">
               <input type="submit" value="%" name="oper">
             
               <p>Result: ${result}</p>
        </form>
        <a href="./age">Age Calculator</a>
    </body>
</html>
