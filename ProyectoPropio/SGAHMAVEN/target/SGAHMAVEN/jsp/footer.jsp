<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.time.*;"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <div class="flex-center-x-y h-50p" id="footer">
            
            Copyright <% LocalDate date = LocalDate.now();%> <%= date%>

        </div>

    </body>
</html>

