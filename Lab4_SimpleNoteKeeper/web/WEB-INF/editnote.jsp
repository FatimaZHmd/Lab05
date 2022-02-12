<%-- 
    Document   : editnote
    Created on : Feb 10, 2022, 6:45:14 PM
    Author     : zahra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <div>
             <form action="note" method="post">
            <label>Title</label> <br>
            <input type="text" name="title" value="${note.title}"> <br>
                
                     
            <label>Content:</label> <br>
            <input type="text" name="contents" value="${note.contents}">  <br>
           
            <input type="submit" value="Save">
        </form>
            
           
        </div>
    </body>
</html>
