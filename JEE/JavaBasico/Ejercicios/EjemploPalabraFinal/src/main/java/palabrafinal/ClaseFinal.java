package palabrafinal;

public final class ClaseFinal {

    // Variables marcadas como final
    public final int varNumero = 10;
    
    // Constante en Java
    public static final int VAR_PRIMITIVO = 15;
    
    public static final Persona VAR_PERSONA = new Persona();
    
    // Metodo final
    public final void metodoFinal(){}
    

    
}

// No es posible crear clases hijas
// de una clase marcada con fianl
// class Clase exends ClaseFinal{

    // no es posible modificar el comportamiento (sobreescritura)
    // de un metodo padre marcado como final
    // public void metodoFinal(){}

// }