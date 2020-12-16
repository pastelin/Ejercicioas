package datos;

import domain.Persona;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class PersonaJDBC {
    
    private Connection conexionTransaccional;

    private static final String SQL_SELECT = 
            "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
    private static final String SQL_INSERT = 
            "INSERT INTO persona (nombre, apellido, email, telefono) values(?, ?, ?, ?)";
    private static final String SQL_UPDATE = 
            "UPDATE persona SET nombre=?, apellido=?, email=?, telefono=? where id_persona=?";
    private static final String SQL_DELETE = 
            "DELETE FROM persona where id_persona=?";
    
    
    public PersonaJDBC() {
    
    }
    
    public PersonaJDBC(Connection conexionTransaccional) {
        
        this.conexionTransaccional = conexionTransaccional;
        
    }
    
    
    public List<Persona> select() throws SQLException{
        
        Connection conn = null; 
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null; 
        List<Persona> personas = new ArrayList();
        
        try {
            
            // Crea la coneccion
            conn = ( this.conexionTransaccional != null ) ? 
                    this.conexionTransaccional : Conexion.getConnection();
            
            // Crea un objeto de PreparedStatement
            stmt = conn.prepareStatement(SQL_SELECT);
            
            rs = stmt.executeQuery();
            
            while ( rs.next() ) {
                
                int id_persona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                
                persona = new Persona();
                persona.setIdPersona(id_persona);
                persona.setNombre(nombre);
                persona.setApellido(apellido);
                persona.setEmail(email);
                persona.setTelefono(telefono);
                
                personas.add(persona);
            
            }
            
        } finally {
            
            Conexion.close(rs);
            Conexion.close(stmt);
            
            if ( this.conexionTransaccional == null ) {
                
                Conexion.close(conn);
                
            }
            
        }
        
        return personas;
        
    }
    
    public int insert(Persona persona) throws SQLException {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int row = 0;
        
        try {
            
            conn = ( this.conexionTransaccional != null ) ? 
                    this.conexionTransaccional : Conexion.getConnection();
            
            stmt = conn.prepareStatement(SQL_INSERT);
            
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            
            System.out.println("Ejecutando query: " + SQL_INSERT);
            row = stmt.executeUpdate();
            System.out.println("Registros afectados:" + row);
            
        } finally {
            
            Conexion.close(stmt);
            
            if ( this.conexionTransaccional == null ) {
            
                Conexion.close(conn);
                
            }
            
        }
        
        return row;
        
    }
    
    public int update(Persona persona) throws SQLException {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            
            conn = ( this.conexionTransaccional != null ) ? 
                    this.conexionTransaccional : Conexion.getConnection();
            
            System.out.println("Ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            stmt.setInt(5, persona.getIdPersona());
            
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados: " + rows);
            
        } finally {
        
            Conexion.close(stmt);
            
            if ( this.conexionTransaccional == null ) {
                
                Conexion.close(conn);
                
            }
            
            
        }
        
        return rows;
        
    }
    
    public int delete(Persona persona) throws SQLException {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            
            conn = ( this.conexionTransaccional != null ) ?
                    this.conexionTransaccional : Conexion.getConnection();
            
            System.out.println("Ejecutando query: " + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            
            stmt.setInt(1, persona.getIdPersona());
            
            rows = stmt.executeUpdate();
            
            System.out.println("Registros eliminados: " + rows);
            
            
        } finally {
            
            Conexion.close(stmt);
            
            if ( this.conexionTransaccional == null ) {
                
                Conexion.close(conn);
                
            }
            
        }
        
        return rows;
        
    }
    
}
