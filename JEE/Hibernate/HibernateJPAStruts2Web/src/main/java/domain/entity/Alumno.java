package domain.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * Clase de entidad que es mapeada con la tabla alumno en la base de datos
 * y a la vez con domicilio y contacto
 * 
 * @author Juan pastelin Brioso
 * @version 1.0
 */

@Entity
public class Alumno implements Serializable {

    private static final long serialVersionUID = 1l;
    
    /**
     * Variable mapeada con la columna id_alumno de la tabla domicilio
     */
    /*
    @Id indica que la variable sera el id de la tabla mapeada
    @GeneratedValue, define como se genera el valor para el id
    @Column, se usa cuando el nombre de la variable no coincide con la columna en la tabla de bd
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alumno")
    private Integer idAlumno;
    
    /**
     * Variable mapeada con la columna nombre de la tabla alumno
     */
    private String nombre; 
    
    /**
     * Variable mapeada con la columna nombre de la tabla alumno
     */
    private String apellido;
    
    /**
     * Variable mapeada con la columno id_domicilio de la tabla alumno
     */
    /*
    @JoinColumn, indica que columna se va a unir entre estas tablas, el primer 
        parametro de el id de la tabla alumno y el segundo de domicilio
    @ManyToOne, indica que la relacion es de muchos a uno, y la propiedad cascade
        le permitira guardar los registros para domicilio desde el persist de alumno
    */
    @JoinColumn(name="id_domicilio", referencedColumnName = "id_domicilio")
    @ManyToOne(cascade = CascadeType.ALL )
    private Domicilio domicilio;
    
    /**
     * Variable mapeada con la columno id_domicilio de la tabla alumno
     */
    /*
    @JoinColumn, indica que columna se va a unir entre estas tablas, el primer 
        parametro de el id de la tabla alumno y el segundo de contacto
    @ManyToOne, indica que la relacion es de muchos a uno, y la propiedad cascade
        le permitira guardar los registros para contacto desde el persist de alumno
    */
    @JoinColumn(name = "id_contacto", referencedColumnName = "id_contacto")
    @ManyToOne(cascade = CascadeType.ALL)
    private Contacto contacto;

    public Alumno() {}
    
    public Alumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.idAlumno);
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
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.idAlumno, other.idAlumno)) {
            return false;
        }
        return true;
    }
    
}
