package datos;

import domain.PersonaDTO;
import java.util.*;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public interface PersonaDao {

    public int insert(PersonaDTO persona);
    
    public int update(PersonaDTO persona);
    
    public int delete(PersonaDTO persona);
    
    public List<PersonaDTO> select();
    
}
