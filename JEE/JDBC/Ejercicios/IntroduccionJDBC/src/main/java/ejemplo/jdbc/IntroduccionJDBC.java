package ejemplo.jdbc;

import java.sql.*;
/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class IntroduccionJDBC {
    
    public static void main(String[] args) {
        
        // Paso 1: creamos nuestra cadena de conexion a mysql
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
        
        try {
            
            // Paso 2: Creamos el objeto de conexion a mysql
            Connection conexion = DriverManager.getConnection(url, "root", "admin");
            
            // Paso 3: Creamos un objeto Statement
            Statement instruccion = conexion.createStatement();
            
            // Paso 4: Creamos el query
            String sql = "select id_persona, nombre, apellido, email, telefono from persona";
            
            // Paso 5: Ejecucion del qeury
            ResultSet resultado = instruccion.executeQuery(sql);
            
            // Paso 6: Procesamos el resultado
            while ( resultado.next() ) {
                
                System.out.print("Id_persona: " + resultado.getInt(1));
                System.out.print(" Nombre: " + resultado.getString(2));
                System.out.print(" Apellido: " + resultado.getString(3));
                System.out.print(" Email: " + resultado.getString(4));
                System.out.print(" Telefono: " + resultado.getString(5));
                System.out.println(" ");
            }
            
            // Paso 7: Cerramos cada objeto que hemos utilizado
            resultado.close();
            instruccion.close();
            conexion.close();
            
        } catch ( SQLException ex ) {
            
            ex.printStackTrace(System.out);
            
        }
        
    }
    
    
    
    

}
