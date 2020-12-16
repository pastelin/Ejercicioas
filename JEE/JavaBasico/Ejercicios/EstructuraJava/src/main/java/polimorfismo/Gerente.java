package polimorfismo;

public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, double precio, String departamento) {

        super(nombre, precio);
        this.departamento = departamento;
        
    }

    
    /**
     * Sobreescribimos el metodo heredada
     * Este metodo muestra los datos del nombre, sueldo y departamento
     * 
     * @return String 
     */
    @Override
    public String obtenerDetalles(){
        
        return super.obtenerDetalles() + ", Departamento: " + this.departamento ;
        
    }
    
    public String getDepartamento(){
        return this.departamento;
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
}
