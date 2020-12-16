
public class PasoPorReferencia {

    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.cambiarNombre("Juan");
        
        System.out.println("Valor nombre: " + persona.obtenerNomber());
        
        modificarPersona(persona);
        
        System.out.println("Valor nombre modificado: " + persona.obtenerNomber());
    }

    public static void modificarPersona(Persona personaArg){
        
        personaArg.cambiarNombre("Carlos");
        
    }
    
    
}
