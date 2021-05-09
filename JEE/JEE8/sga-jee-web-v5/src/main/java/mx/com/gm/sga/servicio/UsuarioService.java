package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Local;
import mx.com.gm.sga.domain.Usuario;

@Local
public interface UsuarioService {

    public abstract List<Usuario> listaUsuarios();
    
    public abstract Usuario encontrarUsuarioPorId(Usuario usuario);
    
    public abstract void reguistrarUsuario(Usuario usuario);
    
    public abstract void modificarUsuario(Usuario usuario);
    
    public abstract void eliminarUsuario(Usuario usuario);
    
}
