<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="es_MX" />
<!-- Inicio popup para agregar un prestamo -->
<div class="overlay" id="overlay-prestamo">

    <div class="popup" id="popup-prestamo">

        <a href="#" id="btn-cerrar-popup-prestamo" class="btn-cerrar-popup">
            <i class="fas fa-times"></i>
        </a>

        <h3>Agregar prestamo</h3>

        <form action="${pageContext.request.contextPath}/MovimientoController?accion=insertarPrestamo" method="post" class="formulario" id="formulario">

            <div class="contenedor-inputs">
                
                <div class="formulario__grupo" id="grupo__total">
                    <label class="formulario__label dis-block text-danger">
                        Cantidad maxima a tomar prestado: &nbsp; <fmt:formatNumber value="${totalKeep}" type="currency" />
                    </label>
                    
                </div>

                <div class="formulario__grupo" id="grupo__fecha">
                    <label for="fecha" class="formulario__label dis-block">Fecha</label>
                    <input type="date" name="fecha" id="fecha" class="formulario__input w-100 h-45-lh-45 p-0-40-0-10">
                    <p class="formulario__input-error">La fecha es un dato obligatorio</p>
                </div>

                <div class="formulario__grupo" id="grupo__monto">
                    <label for="monto" class="formulario__label dis-block" >Monto</label>
                    <div class="formulario__grupo-input">
                        <input type="text" class="formulario__input w-100 h-45-lh-45 p-0-40-0-10" id="monto" name="monto">
                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                    </div>
                    <p class="formulario__input-error">Por favor  </p>
                </div>

                <div class="formulario__grupo" id="grupo__descripcion">
                    <label for="descripcion" class="formulario__label dis-block">Descripci&oacute;n</label>
                    <textarea class="formulario__textarea w-100 h-150 p-0-40-0-10" id="descripcion" name="descripcion"></textarea>
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
<!-- FIn popup para agregar un prestamo -->