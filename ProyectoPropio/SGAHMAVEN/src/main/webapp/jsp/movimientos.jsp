<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

    <body>

        <div class="table-50" id="body">
            <article>
                <h1 class="text-center">Movimientos</h1>

                <div class="btn-2">
                    <button class="rgb-boton-accion" id="btn-abrir-ahorro">Agregar Ahorro</button>
                    <button class="rgb-boton-accion" id="btn-abrir-gasto">Agregar Gasto</button>
                </div>

                <div class="container-table">
                    <div class="cabecera-table">
                        <div class="contenido columnas4 rgb-cabecera f-w-b">Id</div>
                        <div class="contenido columnas4 rgb-cabecera f-w-b">Fecha</div>
                        <div class="contenido columnas4 rgb-cabecera f-w-b">Descripcion</div>
                        <div class="contenido columnas4 rgb-cabecera f-w-b">SubTotal</div>
                    </div>

                    <c:if test="${listaMovimientos == null}">

                        <div class="cabecera-table">
                            <div class="sin-contenido rgb-contenido w-100 m-left-2">No hay registros</div>
                        </div>

                    </c:if>

                    <c:forEach var="movimiento" items="${listaMovimientos}">

                        <c:if test="${movimiento.tipoMovimiento.equals('ahorro')}">
                            <div class="cabecera-table">
                                <div class="contenido columnas4 rgb-contenido">${movimiento.idMovimiento}</div>
                                <div class="contenido columnas4 rgb-contenido">${movimiento.fecha}</div>
                                <div class="contenido columnas4 rgb-contenido">${movimiento.descripcion}</div>
                                <div class="contenido columnas4 rgb-contenido">${movimiento.monto}</div>
                            </div>
                        </c:if>
                        <c:if test="${movimiento.tipoMovimiento.equals('gasto')}">
                            <div class="cabecera-table">
                                <div class="contenido columnas4 rgb-contenido color-rojo">${movimiento.idMovimiento}</div>
                                <div class="contenido columnas4 rgb-contenido color-rojo">${movimiento.fecha}</div>
                                <div class="contenido columnas4 rgb-contenido color-rojo">${movimiento.descripcion}</div>
                                <div class="contenido columnas4 rgb-contenido color-rojo">${movimiento.monto}</div>
                            </div>
                        </c:if>

                    </c:forEach>
                </div>

                <div>&nbsp;</div>

                <c:if test="${listaMovimientos != null}">
                    <hr class="w-100">
                    <div class="cabecera-table">
                        <div class="sin-contenido text-right rgb-contenido w-100 f-w-b">Total:&nbsp;</div>
                        <div class="sin-contenido text-right rgb-contenido f-w-b">$${total}</div>
                    </div>
                </c:if>
            </article>

            <c:import url="popup/ahorrar.jsp" />
            <c:import url="popup/gastar.jsp" />

        </div>

    </body>
</html>
