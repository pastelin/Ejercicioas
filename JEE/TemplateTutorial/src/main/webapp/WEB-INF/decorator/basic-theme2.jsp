<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Title</title>
    </head>
    <body>
        <h1>Header 2</h1>
        <a href="index.jsp">Index</a>
        <a href="news.jsp">News</a>
        <a href="contact.jsp">Contact</a>
        <decorator:getProperty property="div.prueba" />
        <h1>Footer</h1>
    </body>
</html>
