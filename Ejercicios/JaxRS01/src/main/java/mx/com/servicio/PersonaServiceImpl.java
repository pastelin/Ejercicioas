package mx.com.servicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.datos.PersonaDatosDao;
import mx.com.dominio.Persona;

@Stateless
public class PersonaServiceImpl implements PersonaService {

    @Inject
    PersonaDatosDao personaDatosDao;
    
    @Override
    public List<Persona> listarPersonas() {
        return personaDatosDao.listarPersonas();
    }

}
