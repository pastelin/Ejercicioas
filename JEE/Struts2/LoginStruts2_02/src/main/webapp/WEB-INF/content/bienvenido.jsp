<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="bienvenido.titulo"/></title>
    </head>
    <body>
        <h1><s:text name="bienvenido.titulo"/></h1>
        <h3><s:text name="bienvenido.mensaje"/></h3>
        <br />
        <s:text name="form.usuario" /> : <s:property value="usuario" />
        <s:text name="form.password" /> : <s:property value="password" />
        <br />
        <a href="<s:url action="login" />"><s:text name="bienvenido.regresar" /></a>
    </body>
</html>
