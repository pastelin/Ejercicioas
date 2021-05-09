<div id="contenido">
    <!-- Botones para agregar movimientos -->
    <jsp:include page="/WEB-INF/paginas/comunes/botonesNavegacionAddMovimiento.jsp" />

    <section>
        <div class="container">
            <div class="row">

                <!-- Listado de movimientos -->
                <jsp:include page="/WEB-INF/paginas/movimiento/listaMovimientos.jsp" />

                <div class="col-md-5">
                    
                    <!-- Tarjeta para ahorro -->
                    <jsp:include page="/WEB-INF/paginas/movimiento/listaAhorro.jsp" />

                    <!-- Tarjeta para gasto -->
                    <jsp:include page="/WEB-INF/paginas/movimiento/listaGasto.jsp" />

                </div>
            </div>
        </div>
    </section>

    <jsp:include page="/WEB-INF/paginas/movimiento/popup/ahorrar.jsp" />
    <jsp:include page="/WEB-INF/paginas/movimiento/popup/gastar.jsp" />
    <jsp:include page="/WEB-INF/paginas/movimiento/popup/prestamo.jsp" />

</div>
