package dominio;

import java.util.Objects;

/**
 *
 * @author Juan Pastelin Brioso
 *
 * @version 1.0
 */
public class Empleado {

    private String nombre;
    private double sueldo;
    
    public Empleado(String nombre, double sueldo) {
        
        this.nombre = nombre;
        this.sueldo = sueldo;
        
    }
    
    public String getNombre() {
        return this.nombre; 
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getSueldo() {
        return this.sueldo;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Empleado{"
                + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;   
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
}
