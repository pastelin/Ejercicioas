package test;

import datos.*;
import domino.Usuario;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class ManejoUsuario {

    public static void main(String[] args) {

        Connection conexion = null;
        List<Usuario> listaUsuarios = new ArrayList();
        UsuarioJDBC usuarioJDBC = null;

        try {

            conexion = Conexion.getConnextion();

            if (conexion.getAutoCommit()) {

                conexion.setAutoCommit(false);

            }

            usuarioJDBC = new UsuarioJDBC(conexion);

            // insertar
            Usuario usuarioObjInsert = new Usuario("kike", "125478");
            usuarioJDBC.insertUsuario(usuarioObjInsert);

            // actualizar
            // Usuario usuarioObjUpdate = new Usuario(2, "pepe", "456789");
            // usuarioJDBC.updateUsuario(usuarioObjUpdate);

            // consultar
            listaUsuarios = usuarioJDBC.selectUsuario();
            
            listaUsuarios.forEach( usuario -> {
                System.out.println(usuario);
            });
            

            // eliminar
            // Usuario usuarioObjDelete = new Usuario(2);
            // usuarioJDBC.deleteUsuario(usuarioObjDelete);

             // consultar
            listaUsuarios = usuarioJDBC.selectUsuario();
            
            listaUsuarios.forEach( usuario -> {
                System.out.println(usuario);
            });
            
            conexion.commit();

        } catch (SQLException ex) {

            ex.printStackTrace(System.out);

            try {

                conexion.rollback();

            } catch(SQLException ex2) {
                
                ex2.printStackTrace(System.out);
                
            }

        } finally {

            Conexion.close(conexion);

        }

    }

}
