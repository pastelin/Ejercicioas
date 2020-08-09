<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@page import="java.time.*;"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:300,400,600|Open+sans" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/styles.css">
        
        <title>SGAH</title>
    </head>
    <body>
        <div class="container">

            <div class="header border-rgba-2">

                <nav>
                    <div class="p-absolute m-top-15 m-left-10">
                        <h1>SISTEMA GESTOR DE AHORROS</h1>
                    </div>
                    <ul>
                        <li>
                            <a href="movimientos.jsp">Ahorro</a>
                        </li>

                        <li>
                            <a>Gasto</a>
                        </li>
  
                        <li>
                            <a>Articulo</a>
                        </li>

                        <li>
                            <a>Salir</a>
                        </li>

                    </ul>

                </nav>


            </div>

            <div class="body rgba-3 flex-center-x">
                <decorator:getProperty property="div.body" />


            </div>

            <div class="footer rgba-2">

                <div class="flex-center-x-y h-50p" id="footer">

                    Copyright <% LocalDate date = LocalDate.now();%> <%= date%>

                </div>


            </div>

        </div>

    <script type="text/javascript" src="js/popup.js"></script>
    </body>
</html>
