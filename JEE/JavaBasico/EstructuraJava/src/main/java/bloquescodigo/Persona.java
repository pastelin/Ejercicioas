package bloquescodigo;

/**
 * Ejemplo del uso de bloques de inicializadores estaticos y de instancia
 *
 * @author XME6301
 * @version 1.0
 */
public class Persona {

    // Declaracion de atributos
    private final int idPersona;
    private static int contadorPersonas;

    // Bloque de inicializacion de codigo static
    static {

        contadorPersonas = 10;
        System.out.println("Ejecucion bloque eatatico");

    }

    // Bloque NO estatico se copia a cada objeto
    {

        System.out.println("Ejecucion bloque NO estatico");
        this.idPersona = ++contadorPersonas;
            
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }
    
    /**
     * 
     * @return int id de la persona 
     */
    public int getIdPersona(){
        return this.idPersona;
    }

}
