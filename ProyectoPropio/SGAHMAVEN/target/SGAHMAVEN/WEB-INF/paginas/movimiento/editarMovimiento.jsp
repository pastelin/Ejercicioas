<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="es_MX" />
<div id="contenido">
    <form action="${pageContext.request.contextPath}/MovimientoController?accion=modificar&idMovimiento=${movimiento.idMovimiento}"
          method="post" class="was-validated">
        <jsp:include page="/WEB-INF/paginas/comunes/BotonesNavegacionEdicion.jsp" />
        <section id="details">
            <div class="container">
                <div class="row">
                    <div class="col">
                        <div class="card">
                            <div class="card-header">
                                <h4>Editar Movimiento</h4>
                            </div>
                            <div class="card-body">
                                <div class="form-group text-center">
                                    <h5 class="color-rojo">Total a pagar : <fmt:formatNumber value="${movimiento.monto}" type="currency" /></h5>
                                </div>
                                <div class="form-group">
                                    <label for="descripcion">Descripcion</label>
                                    <textarea class="form-control" id="descripcion" name="descripcion" required>${movimiento.descripcion}</textarea>
                                </div>
                                <div class="form-group">
                                    <label for="monto">Monto</label>
                                    <input type="number" class="form-control" id="monto" name="monto" step="any" required value="${movimiento.monto}" />
                                </div>
                                <div class="form-group">
                                    <input type="hidden" class="form-control" id="fecha" name="fecha" value="${movimiento.fecha}" />
                                    <input type="hidden" class="form-control" id="tipoMovimiento" name="tipoMovimiento" value="${movimiento.tipoMovimiento}" />
                                    <input type="hidden" class="form-control" id="asignacion" name="asignacion" value="${movimiento.asignacion}" />
                                    <input type="hidden" class="form-control" id="montoAnterior" name="montoAnterior" value="${movimiento.monto}" />
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </form>
</div>