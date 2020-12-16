package domino;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class Usuario {

    private int id_usuario;
    private String usuario;
    private String password;
    
    public Usuario() {
        
    }
    
    public Usuario(int id_usuario) {
        
        this.id_usuario = id_usuario;
        
    }
    
    public Usuario(String usuario, String password) {
        
        this.usuario = usuario;
        this.password = password;
        
    }
    
    public Usuario(int id_usuario, String usuario, String password) {
        
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.password = password;
        
    }
    
    public int getIdUsuario() {
        return this.id_usuario;
    }
    
    public void setIdUsuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    } 
    
    @Override
    public String toString() {
        
        return "Usuario{ " + "id_usuario = " + this.id_usuario + " usuario = " +
                this.usuario + " passwor = " + this.password + " }";
        
    }
    
}
