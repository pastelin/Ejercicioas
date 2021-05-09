package mx.com.datos;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;
import mx.com.dominio.Persona;

@Stateless
public class PersonaDatosDaoImpl implements PersonaDatosDao {

    @PersistenceContext(unitName="PersonaPU")
    EntityManager em;
    
    @Override
    public List<Persona> listarPersonas() {
        return em.createNamedQuery("Persona.findAll").getResultList();
    }

    
    
}
