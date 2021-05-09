(function () {
    
    /* Funcionamiento para el popup ahorrar */
    let btnAbrirPopupAhorro = document.getElementById('btn-abrir-ahorro'),
            overlayAhorro = document.getElementById('overlay-ahorro'),
            popupAhorro = document.getElementById('popup-ahorro'),
            btnCerrarPopupAhorro = document.getElementById('btn-cerrar-popup-ahorro');


    btnAbrirPopupAhorro.addEventListener('click', function () {
        overlayAhorro.classList.add('active');
        popupAhorro.classList.add('active');
    });

    btnCerrarPopupAhorro.addEventListener('click', function () {
        overlayAhorro.classList.remove('active');
        popupAhorro.classList.remove('active');
    });
    
    /* Funcionamiento para el popup ahorrar */
    let btnAbrirPopupGasto = document.getElementById('btn-abrir-gasto'),
            overlayGasto = document.getElementById('overlay-gasto'),
            popupGasto = document.getElementById('popup-gasto'),
            btnCerrarPopupGasto = document.getElementById('btn-cerrar-popup-gasto');
            
    btnAbrirPopupGasto.addEventListener('click', function () {
        overlayGasto.classList.add('active'); 
        popupGasto.classList.add('active');
    });
    
    btnCerrarPopupGasto.addEventListener('click', function () {
        overlayGasto.classList.remove('active');
        popupGasto.classList.remove('active');
        
    });
    
    /* Funcionamiento para el popup ahorrar */
    let btnAbrirPopupPrestamo = document.getElementById('btn-abrir-prestamo'),
            overlayPrestamo = document.getElementById('overlay-prestamo'),
            popupPrestamo = document.getElementById('popup-prestamo'),
            btnCerrarPopupPrestamo = document.getElementById('btn-cerrar-popup-prestamo');
            
    btnAbrirPopupPrestamo.addEventListener('click', function () {
        overlayPrestamo.classList.add('active'); 
        popupPrestamo.classList.add('active');
    });
    
    btnCerrarPopupPrestamo.addEventListener('click', function () {
        overlayPrestamo.classList.remove('active');
        popupPrestamo.classList.remove('active');
        
    });
    
    
}());