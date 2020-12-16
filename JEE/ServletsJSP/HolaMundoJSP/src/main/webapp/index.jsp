<%-- 
    Document   : index
    Created on : 15/11/2020, 10:57:22 PM
    Author     : paste
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola Mundo JSPs</title>
    </head>
    <body>
        
        <h1>Hola Mundo JSPs</h1>
        
        <ul>
            <li> <% out.print("Hola mundo con Scriptlets"); %> </li>
            <li> ${"Hola mundo con Expresion Language (EL)"} </li>
            <li> <%= "Hola mundo con expresiones"  %> </li>
            <li> <c:out value="Hola mundo con JSTL" /> </li>
        </ul>
        
    </body>
</html>
