public class Persona {

    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;
    
    private Persona(){
        // super(); se manda a llamar de manera automatica
        this.idPersona = ++contadorPersonas;
    }
    
    // Constructor completo - sobrecarga
    public Persona(String nombre, int edad){
        this();
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getContadorPersonas(){
        return this.contadorPersonas;
    }
    
    
    @Override
    public String toString(){
        return "Persona { " + "idPersona: " + idPersona + " nombre: " + nombre + 
                " edad: " + edad + " }";
    }
    

    
}
