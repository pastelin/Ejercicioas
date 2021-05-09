package domain.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * Clase de entidad que es mapeada con la tabla domicilio en la base de datos
 * 
 * @author Juan pastelin Brioso
 * @version 1.0
 */

@Entity
public class Domicilio implements Serializable {

    private static final long SerialVersionUID = 1l;
    
    /**
     * Variable mapeada con la columna id_domicilio de la tabla domicilio
     */
    /*
    @Id indica que la variable sera el id de la tabla mapeada
    @GeneratedValue(strategy = GenerationType.IDENTITY), define como se genera 
    el valor para el id
    @Column(name = "id_domicilio"), se usa cuando el nombre de la variable no 
    coincide con la columna en la tabla de bd
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_domicilio")
    private Integer idDomicilio;
    
    /**
     * Variable mapeada con la columna calle de la tabla domicilio
     */
    private String calle;
    
    /**
     * Variable mapeada con la columna no_calle de la tabla domicilio
     */
    @Column(name = "no_calle")
    private String noCalle;
    
    private String pais;
    
    public Domicilio() {
        
    }
    
    public Domicilio(Integer idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public Integer getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(Integer idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNoCalle() {
        return noCalle;
    }

    public void setNoCalle(String noCalle) {
        this.noCalle = noCalle;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.idDomicilio;
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
        final Domicilio other = (Domicilio) obj;
        if (this.idDomicilio != other.idDomicilio) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "idDomicilio=" + idDomicilio + ", calle=" + calle + ", noCalle=" + noCalle + ", pais=" + pais + '}';
    }
    
}
