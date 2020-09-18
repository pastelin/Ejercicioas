<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.time.*;"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>


        <div class="table-50" id="body">
            <article>
                <h1 class="text-center">Movimientos</h1>

                <div class="btn-2">

                    <button class="rgba-4" id="btn-abrir-ahorro">Agregar Ahorro</button>
                    <button class="rgba-4" href="#">Agregar Gasto</button>

                </div>

                <div class="cabecera-table">
                    <div class="cabecera">Id</div>
                    <div class="cabecera">Fecha</div>
                    <div class="cabecera">Monto</div>
                    <div class="cabecera">Descripcion</div>
                    <div class="cabecera"></div>
                </div>

                <div>
                    <div></div>
                    <div></div>
                    <div></div>
                    <div></div>
                    <div></div>
                </div>
            </article>

            <div class="overlay" id="overlay">

                <div class="popup" id="popup">

                    <a href="#" id="btn-cerrar-popup" class="btn-cerrar-popup">
                        <i class="fas fa-times"></i>
                    </a>

                    <h3>Agregar ahorro</h3>

                    <form action="" class="formulario" id="formulario">

                        <div class="contenedor-inputs">

                            <div class="formulario__grupo" id="grupo__fecha">

                                <label for="fecha" class="formulario__label">Fecha</label>
                                <input type="date" name="fecha" id="fecha" class="formulario__input">
                                <p class="formulario__input-error">La fecha es un dato obligatorio</p>

                            </div>

                            <div class="formulario__grupo" id="grupo__monto">

                                <label for="monto" class="formulario__label" >Monto</label>

                                <div class="formulario__grupo-input">
                                    <input type="text" class="formulario__input" id="monto" name="monto">
                                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                                </div>

                                <p class="formulario__input-error">Por favor  </p>

                            </div>

                            <div class="formulario__grupo" id="grupo__monto">

                                <label for="descripcion" class="formulario__label">Descripci&oacute;n</label>

                                <textarea class="formulario__textarea" id="descripcion" name="descripcion"></textarea>

                            </div>

                        </div>

                        <div class="formulario__mensaje" id="formulario__mensaje">
                            <p>
                                <i class="fas fa-exclamation-triangle"></i> 
                                <strong>Error</strong> Por favor rellena el formulario correctamente.
                            </p>
                        </div>

                        <div class="formulario__grupo formulario__grupo-btn-enviar">
                            <button type="submit" class="btn-submit">Enviar</button>
                            <p class="formulario__mensaje-exito" id="formulario__mensaje-exito">Formulario enviado exitosamente!</p>
                        </div>

                        

                    </form>

                </div>
            </div>

        </div>

    </body>
</html>