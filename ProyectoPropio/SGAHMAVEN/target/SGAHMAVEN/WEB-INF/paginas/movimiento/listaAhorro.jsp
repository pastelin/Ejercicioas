<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="es_MX" />

<div class="card overflow mh-200 mb-5">
    <div class="card-header">
        <div class="container">
            <div class="row">
                <h5 style="width: 50%;">Ahorro</h5>
                <c:if test="${listaMovimientos != null}">
                    <h5 class="text-right text-warning" style="width: 50%">
                        Total:&nbsp;
                        <fmt:formatNumber value="${totalKeep}" type="currency" />
                    </h5>
                </c:if>
            </div>
        </div>
    </div>
    <table class="table table-striped">
        <thead class="thead-dark">
            <tr>
                <th>#</th>
                <th>Fecha</th>
                <th>Monto</th>
            </tr>
        </thead>
        <tbody>
            <!-- Valida que la lista no venga vacia -->
            <c:if test="${totalBorrow == 0}">
                <tr>
                    <td class="bg-info text-white" colspan="3">No hay prestamos activos</td>
                </tr>
            </c:if>
            <c:if test="${totalBorrow > 0}">
                <tr>
                    <td class="bg-warning text-white" colspan="3">Hay prestamos activos</td>
                </tr>
            </c:if>

            <!-- Itera cada elemento de la lista de movimientos -->
            <c:forEach var="movimiento" items="${listaMovimientos}" varStatus="status">
                <c:if test="${movimiento.asignacion.equals('borrow')}">
                    <tr>
                        <td>${status.count}</td>
                        <td>${movimiento.fecha}</td>
                        <td>${movimiento.monto}</td>
                    </tr>
                </c:if>
            </c:forEach>
        </tbody>
    </table>
</div>