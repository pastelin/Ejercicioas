package domain;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class Usuario {

    private int id_usuario;
    private String usuario;
    private String passsword;
    
    
    public Usuario() {
    
    }
    
    public Usuario(int id_usuario) {
        
        this.id_usuario = id_usuario;
        
    }
    
    public Usuario(String usuario, String password) {
        
        this.usuario = usuario; 
        this.passsword = password;
        
    }
    
    public Usuario(int id_usuario, String usuario, String password) {
        
        this.id_usuario = id_usuario;
        this.usuario = usuario; 
        this.passsword = password;
        
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
        return this.passsword;
    }
    
    @Override
    public String toString() {
        
        return "Usuario{" + " id_usuario=" + this.id_usuario + " usuario=" +
                this.usuario + " password=" + this.passsword + "}";
        
    }
    
}