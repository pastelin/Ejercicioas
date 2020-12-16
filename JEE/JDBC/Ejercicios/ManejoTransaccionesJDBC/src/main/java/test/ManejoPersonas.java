package test;

import datos.Conexion;
import datos.PersonaJDBC;
import domain.Persona;
import java.sql.*;
import java.util.List;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class ManejoPersonas {

    public static void main(String[] args) {

        Connection conexion = null;
        
        try {

            conexion = Conexion.getConnection();
            
            if ( conexion.getAutoCommit() ) {
                
                conexion.setAutoCommit(false);
                
            }
            
            PersonaJDBC personaJDBC = new PersonaJDBC(conexion);
            
            Persona cambioPersonaObj = new Persona();
            cambioPersonaObj.setIdPersona(2);
            cambioPersonaObj.setNombre("Maria");
            cambioPersonaObj.setApellido("Carmona");
            cambioPersonaObj.setTelefono("123456798");
            cambioPersonaObj.setEmail("Maria@gmail.com");
            
            personaJDBC.update(cambioPersonaObj);
            
            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Karla");
            nuevaPersona.setApellido("Lopez");
            
            personaJDBC.insert(nuevaPersona);
            
            conexion.commit();

        } catch (SQLException ex) {

            ex.printStackTrace(System.out);
            
            try {
                
                conexion.rollback();
                
            } catch (SQLException ex1) {
                
                System.out.println(System.out);
                
            }
            
        }

    }
}
