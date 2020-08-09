package palabrafinal;

public class EjemploPalabraFinal {

    public static void main(String[] args){
        
        // Modificar un atributo final, no es posible modificarlo
        // ClaseFinal.VAR_PRIMITIVO = 20;
        
        // Modificar la referencia de un atributo de tipo Object
        // ClaseFinal.VAR_PERSONA = new Persona();
        
        ClaseFinal.VAR_PERSONA.setNombre("Juan");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
        
        ClaseFinal.VAR_PERSONA.setNombre("Eunice");
        System.out.print(ClaseFinal.VAR_PERSONA.getNombre());
    
    }
    


    
}
