<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:property value="titulo" /></title>
    </head>
    <body>
        <h1><s:property value="titulo" /></h1>
        <s:form>
            <s:textfield key="form.usuario" name="user" />
            <s:password key="form.password" name="password" />
            <s:submit key="form.boton" name="submit" />
        </s:form>
        
        <div>
            <h3><s:property value="valores" /></h3>
            <p><s:property value="usuario" /> : <s:property value="user" /></p>
            <p><s:property value="formPass" /> : <s:property value="password" /></p>
        </div>
    </body>
</html>
