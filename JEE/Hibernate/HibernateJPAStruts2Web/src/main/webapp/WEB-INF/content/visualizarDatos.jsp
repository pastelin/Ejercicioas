<%@taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Modificar Alumno</title>
        <script>
            function eliminarEvent() {
                var form = document.getElementById("formModificarAlumno");
                form.setAttribute("action", "eliminarAlumno");
            }
            function modificarEvent() {
                var form = document.getElementById("formModificarAlumno");
                form.setAttribute("action", "modificarAlumno");
            }
        </script>
    </head>
    <body>
        <div class="contenedor">
            <header>
                <h1>Modificar Alumno</h1>
            </header>
            <form id="formModificarAlumno">
                <s:hidden name="alumno.idAlumno" value="%{alumno.idAlumno}" />
                <s:textfield label="Nombre" name="alumno.nombre" value="%{alumno.nombre}" />
                <s:textfield label="Apellido" name="alumno.apellido" value="%{alumno.apellido}" />

                <br />
                <label>Datos Domicilio</label>
                <s:hidden name="alumno.domicilio.idDomicilio" value="%{alumno.domicilio.idDomicilio}" />
                <s:textfield label="Calle" name="alumno.domicilio.calle" value="%{alumno.domicilio.calle}" />
                <s:textfield label="No.Calle" name="alumno.domicilio.noCalle" value="%{alumno.domicilio.noCalle}" />
                <s:textfield label="Pais" name="alumno.domicilio.pais" value="%{alumno.domicilio.pais}" />
                
                <br />
                <label>Datos de contacto</label>
                <s:hidden name="alumno.contacto.idContacto" value="%{alumno.contacto.idContacto}" />
                <s:textfield label="Email" name="alumno.contacto.email" value="%{alumno.contacto.email}" />
                <s:textfield label="Telefono" name="alumno.contacto.telefono" value="%{alumno.contacto.telefono}" />
                <s:submit value="Modificar" onclick="modificarEvent()"/>
                <s:submit value="Eliminar" onclick="eliminarEvent()" />
            </form>
        </div>
    </body>
</html>
