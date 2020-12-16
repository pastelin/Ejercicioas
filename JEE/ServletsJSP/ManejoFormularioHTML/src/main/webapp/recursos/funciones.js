function validarForma(forma) {
    
    var usuario = forma.usuario;
    
    if ( usuario.value === "" || usuario.value === "Escribir usuario" ) {
        
        alert("Debe proporsionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
        
    }
    
    var password = forma.password;
    
    if ( password.value === "" || password.value.length < 3 ) {
        
        alert("Debe proporsionar un password al menos de 3 caracteres");
        password.focus();
        password.select();
        return false;
        
    }
    
    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false;
    
    for ( var i = 0; i < tecnologias.length; i++ ) {
        
        if ( tecnologias[i].checked  ) {
            
            checkSeleccionado = true;
            
        }
        
    }
    
    if ( !checkSeleccionado ) {
        
        alert("Debe seleccionar una tecnologia");
        return false;
        
    }
    
    var generos = forma.genero;
    var radioSeleecionado = false;
    
    for ( var i = 0; i < generos.length; i++ ) {
        
        if ( generos[i].checked ) {
            
            radioSeleecionado = true;
            
        }
        
    }
    
    if ( !radioSeleecionado ) {
        
        alert("Debe seleccionar un genero");
        return false;
        
    }
    
    var ocupacion    = forma.ocupacion;
    
    if ( ocupacion.value === "" ) {
        
        alert("Debe seleccionar una ocupacion");
        return false;
        
    }
    
    // Formulario es valida
    
    alert("Formulario valido, enviando datos al servidor");
    return true;
    
    
}