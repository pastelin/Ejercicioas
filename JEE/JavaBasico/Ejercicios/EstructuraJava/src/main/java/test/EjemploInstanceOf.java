package test;

import sobreescritura.Empleado;
import sobreescritura.Gerente;

/**
 *
 * @author Juan Pastelin Brioso
 *
 * @version 1.0
 */
public class EjemploInstanceOf {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Juan", 100);
        determinaTipo(empleado);

        Gerente gerente = new Gerente("Karla", 2000, "Finanzas");
        determinaTipo(gerente);

    }

    public static void determinaTipo(Empleado empleado) {

        if (empleado instanceof Gerente) {

            Gerente gerente = (Gerente) empleado;
            System.out.println("departamento del gerente: " + gerente.getDepartamento());

            // System.out.println(((Gerente) empleado).getDepartamento());
        
        } else if (empleado instanceof Empleado) {

            System.out.println("nombre empleado: " + empleado.getNombre());

        }

    }

}
