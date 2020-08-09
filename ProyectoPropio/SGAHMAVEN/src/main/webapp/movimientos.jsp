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
                    
                    <form action="">
                        <div class="contenedor-inputs">
                        
                            <label>Fecha</label>
                            <input type="date">
                            
                            <label>Monto</label>
                            <input type="monto">
                            
                            <label>Descripci&oacute;n</label>
                            <textarea></textarea>
                            
                        </div>
                            
                        <input type="submit" class="btn-submit" value="Enviar">
                        
                    </form>

                </div>
            </div>

        </div>

    </body>
</html>