<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        <s:url id="fileDownload" namespace="/" action="download.action" ></s:url>

        <h2>Download file - <s:a href="%{fileDownload}">pdf</s:a>

    </body>
</html>
