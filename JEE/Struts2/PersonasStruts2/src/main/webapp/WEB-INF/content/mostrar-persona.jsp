<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Mostrar Persona con Struts2</title>
    </head>
    <body>
        <h1>Persona Struts2</h1>
        <s:form>
            <s:textfield name="nombre" />
            <s:submit value="Enviar" />
        </s:form>
        <div>
            Nombre proporcionado: <s:property value="nombre" />
        </div>
    </body>
</html>
