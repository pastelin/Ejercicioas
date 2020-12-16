package test;

import datos.UsuarioJDBC;
import domain.Usuario;
import java.util.*;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class ManejoUsuarioJDBC {

    public static void main(String[] args) {
        
        //Usuario usuarioObj = new Usuario("paola", "1234656412");
        //Usuario usuarioObjUpdate = new Usuario(1, "juan", "147852");
        Usuario usuarioObjDelete = new Usuario(1);
        UsuarioJDBC usuarioJDBC = new UsuarioJDBC();
        List<Usuario> listaUsuarios;
        
        // Agregar usuario
        //usuarioJDBC.insertUsuario(usuarioObj);
        
        // Actualizar usuario
        //usuarioJDBC.updateUsuario(usuarioObjUpdate);
        
        // Elimina usuario
        usuarioJDBC.deleteUsuario(usuarioObjDelete);
        
        listaUsuarios = usuarioJDBC.selectUsuario();
        
        listaUsuarios.forEach( usuario -> {
            System.out.println(usuario);
        });
        
        
    }
    
    
    
}
