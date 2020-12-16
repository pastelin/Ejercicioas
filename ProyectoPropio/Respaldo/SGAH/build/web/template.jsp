<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/styles.css">
        <title>Inicio</title>
    </head>
    <body>
        
        <div class="container">
            
            <div class="header rgba-2">
                
                <%@ include file="/jsp/header.jsp" %>
                
            </div>
            
            <div class="body rgba-3 flex-center-x">
                
                <%@include file="/jsp/movimientos.jsp"%>
                
            </div>
            
            <div class="footer rgba-2">
                
                <%@include file="/jsp/footer.jsp" %>
                
            </div>
            
        </div>
        
    </body>
</html>
