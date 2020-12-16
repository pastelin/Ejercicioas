<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alcance de Variables</title>
    </head>
    <body>
        
        <h1>Alcance de Variables</h1>
        <br/>
        Variable request: 
        Base: ${rectanguloRequest.base}
        Altura: ${rectanguloRequest.altura} 
        Area: ${rectanguloRequest.area}
        <br/><br/>
        Variable sesion: 
        Base: ${rectanguloSesion.base}
        Altura: ${rectanguloSesion.altura} 
        Area: ${rectanguloSesion.area}
        <br/><br/>
        Variable request: 
        Base: ${rectanguloApplicacion.base}
        Altura: ${rectanguloApplicacion.altura} 
        Area: ${rectanguloApplicacion.area}
        <br/><br/>
        <a href="${pageContect.request.contextPath}/index.jsp">Regresar al inicio</a>
        
    </body>
</html>
