
package mx.com.gm.test;

import java.util.List;
import mx.com.gm.dao.AlumnoDAO;
import mx.com.gm.dao.AsignacionDAO;
import mx.com.gm.dao.ContactoDAO;
import mx.com.gm.dao.CursoDAO;
import mx.com.gm.dao.DatosGenericDAO;
import mx.com.gm.dao.DomicilioDAO;

public class TestDAOs {

    public static void main(String[] args) {
        
        DatosGenericDAO alumnoDao = new AlumnoDAO();
        System.out.println("Alumnos: ");
        imprimir(alumnoDao.listar());
        
        DatosGenericDAO domicilioDao = new DomicilioDAO();
        System.out.println("Domicilios: ");
        imprimir(domicilioDao.listar());
        
        DatosGenericDAO contactoDao = new ContactoDAO();
        System.out.println("Contactos: ");
        imprimir(contactoDao.listar());
        
        DatosGenericDAO cursoDao = new CursoDAO();
        System.out.println("Cursos: ");
        imprimir(cursoDao.listar());
        
        DatosGenericDAO asignacionDao = new AsignacionDAO();
        System.out.println("Asignaciones: ");
        imprimir(asignacionDao.listar());
        
    }
    
    private static void imprimir(List coleccion) {
        for (Object o : coleccion) {
            System.out.println("valor = " + coleccion);
        }
    }
    
}
