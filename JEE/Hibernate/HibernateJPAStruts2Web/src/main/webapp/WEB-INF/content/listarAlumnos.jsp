<%@taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="/HibernateJPAStruts2Web/css/estilos.css" />
        <title>JSP Page</title>
    </head>
    <body>
        <div class="contenedor">
            <header>
                <h3>Listar Alumnos</h3>
            </header>
            <nav>
                <a href="<s:url action="agregar-form" />">Agregar</a>
            </nav>
            <section class="contenedor-tabla">
                <table>
                    <tr>
                        <th class="wd-10">Alumno ID</th>
                        <th>Nombre</th>
                        <th>Domicilio</th>
                        <th>Email</th>
                        <th>Tel&eacute;fono</th>
                    </tr>
                    <s:if test="listaAlumnos != null && !listaAlumnos.isEmpty()">
                        <s:iterator value="listaAlumnos" var="alumno">
                            <tr>
                                <td class="wd-10">
                                    <s:a action="verDatos" ><s:property value="idAlumno" />
                                        <s:param name="id" value="%{idAlumno}" />
                                    </s:a>
                                </td>
                                <td>
                                    <s:property value="nombre" />&nbsp;
                                    <s:property value="apellido" />
                                </td>
                                <td><s:property value="domicilio.calle" />&nbsp;
                                    <s:property value="domicilio.noCalle"/>&nbsp;
                                    <s:property value="domicilio.pais" />
                                </td>
                                <td>
                                    <s:property value="contacto.email" />
                                </td>
                                <td>
                                    <s:property value="contacto.telefono" />
                                </td>
                            </tr>
                        </s:iterator>
                    </s:if>
                    <s:else>
                        <tr>
                            <td colspan="5">No hay datos</td>
                        </tr>
                    </s:else>
                </table>
            </section>
        </div>
    </body>
</html>
