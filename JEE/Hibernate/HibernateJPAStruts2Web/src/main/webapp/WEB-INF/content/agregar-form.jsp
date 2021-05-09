<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Alumno</title>
    </head>
    <body>
        <div class="contenedor">
            <header>
                <h1>Agregar Alumno</h1>
            </header>
            <section>
                <s:form action="agregarAlumno" method="post">
                    <s:textfield label="nombre" name="alumno.nombre" />
                    <s:textfield label="apellido" name="alumno.apellido" />

                    <s:label>Datos Domicilio:</s:label>
                    <s:textfield label="calle" name="alumno.domicilio.calle" />
                    <s:textfield label="numero de calle" name="alumno.domicilio.noCalle" />
                    <s:textfield label="pais" name="alumno.domicilio.pais" />

                    <s:label>Datos de Contacto</s:label>
                    <s:textfield label="email" name="alumno.contacto.email" />
                    <s:textfield label="telefono" name="alumno.contacto.telefono" />

                    <s:submit value="Agregar" />
                </s:form>
            </section>
        </div>
    </body>
</html>
