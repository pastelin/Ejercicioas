<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="es_MX" />
<div class="col-md-7">
    <div class="card overflow mh-450 mb-3">
        <div class="card-header">
            <div class="container">
                <div class="row">
                    <h4 style="width: 50%;">Movimientos</h4>
                    <c:if test="${listaMovimientos != null}">
                        <h4 class="text-right text-info" style="width: 50%">
                            Total:&nbsp;
                            <fmt:formatNumber value="${total}" type="currency" />
                        </h4>

                    </c:if>
                </div>
            </div>
        </div>
        <table class="table table-striped">
            <thead class="thead-dark">
                <tr>
                    <th>#</th>
                    <th>Fecha</th>
                    <th>Descripcion</th>
                    <th>Monto</th>
                    <!--<th></th>-->
                </tr>
            </thead>
            <tbody>
                <!-- Valida que la lista no venga vacia -->
                <c:if test="${listaMovimientos == null}">
                    <tr>
                        <td colspan="4">No hay registros</td>
                    </tr>
                </c:if>

                <!-- Itera cada elemento de la lista de movimientos -->
                <c:forEach var="movimiento" items="${listaMovimientos}" varStatus="status">
                    <c:if test="${movimiento.tipoMovimiento.equals('ahorro')}">
                        <tr>
                            <td>${status.count}</td>
                            <td>${movimiento.fecha}</td>
                            <td>${movimiento.descripcion}</td>
                            <td>${movimiento.monto}</td>
<!--                            <td>
                                <a href="${pageContext.request.contextPath}/MovimientoController?accion=editar&idMovimiento=${movimiento.idMovimiento}"
                                   class="btn btn-secondary">
                                    <li class="fas fa-angle-double-right"></li> Editar
                                </a>
                            </td>-->
                        </tr>
                    </c:if>
                    <c:if test="${movimiento.tipoMovimiento.equals('gasto')}">
                        <tr>
                            <td class="color-rojo">${status.count}</td>
                            <td class="color-rojo">${movimiento.fecha}</td>
                            <td class="color-rojo">${movimiento.descripcion}</td>
                            <td class="color-rojo">${movimiento.monto}</td>
<!--                            <td>
                                <a href="${pageContext.request.contextPath}/MovimientoController?accion=editar&idMovimiento=${movimiento.idMovimiento}"
                                   class="btn btn-secondary">
                                    <li class="fas fa-angle-double-right"></li> Editar
                                </a>
                            </td>-->
                        </tr>
                    </c:if>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>
