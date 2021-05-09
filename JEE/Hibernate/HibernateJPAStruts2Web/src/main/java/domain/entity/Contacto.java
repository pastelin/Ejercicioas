package domain.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

/**
 * 
 * Clase de entidad que es mapeada con la tabla contacto en la base de datos
 * 
 * @author Juan pastelin Brioso
 * @version 1.0
 */

@Entity
public class Contacto implements Serializable {

    private static final long serialVersionUID = 1l;
    
    /**
     * Variable mapeada con la columna id_contacto de la tabla domicilio
     */
    /*
    @Id indica que la variable sera el id de la tabla mapeada
    @GeneratedValue, define como se genera el valor para el id
    @Column, se usa cuando el nombre de la variable no coincide con la columna en la tabla de bd
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contacto")
    private Integer idContacto;
    
    /**
     * Variable mapeada con la columna telefono de la tabla contacto
     */
    private String telefono;
    
    /**
     * Variable mapeada con la columna email de la tabla contacto
     */
    private String email;
    
    public Contacto() {
        
    }
    
    public Contacto(Integer idContacto) {
        this.idContacto = idContacto;
    }

    public Integer getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(Integer idContacto) {
        this.idContacto = idContacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.idContacto);
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
        final Contacto other = (Contacto) obj;
        if (!Objects.equals(this.idContacto, other.idContacto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Contacto{" + "idContacto=" + idContacto + ", telefono=" + telefono + ", email=" + email + '}';
    }
    
}
