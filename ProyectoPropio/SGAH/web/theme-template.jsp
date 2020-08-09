<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/styles.css">
        <title></title>
    </head>
    <body>
        <div class="container">
            
            <div class="header rgba-2">
                
                <decorator:getProperty property="div.header" />
                
            </div>
            
            <div class="body rgba-3 flex-center-x">
                
                <decorator:getProperty property="div.movimientos" />
                
            </div>
            
            <div class="footer rgba-2">
                
                <decorator:getProperty property="div.footer" />
                
            </div>
            
        </div>

    </body>
</html>
