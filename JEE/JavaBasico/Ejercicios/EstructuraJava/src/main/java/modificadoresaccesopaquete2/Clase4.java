package modificadoresaccesopaquete2;

import modificadoresaccesopaquete1.Clase1;

public class Clase4 {

    public Clase4() {

        // Prueba de constructores de la clase1
        new Clase1();
        //new Clase1("uno", "dos"); // llamada al constructor protected
        // new Clase1("uno", "dos", "tres"); // llamada al constructor default o package
        // No podemos llamar a constructores privados desde otras clases
        //new Clase1("uno", "dos", "tres", "cuatro");

    }

    
    public void pruebaDesdeClase4() {
        
        Clase1 c1 = new Clase1();
        System.out.println("atributo publico: " + c1.atributoPublico);
        // System.out.println("atributo protegido: " + c1.atributoProtegido);
        // System.out.println("atributo default o package: " + c1.atributoDefault);
        //System.out.println("atributo privado: " + c1.atributoPrivado);
        
        System.out.println("");
        System.out.println("Metodo publico: " + c1.metodoPublico());
        // System.out.println("Metodo protegido: " + c1.metodoProtegido());
        //System.out.println("Metodo default o package: " + c1.MetodoDefault());
        //System.out.println("Metodo privado: " + c1.metodoPrivado());
    
    }
    
        public static void main(String[] args) {
        
        Clase4 c4 = new Clase4();
        
        c4.pruebaDesdeClase4 ();
        
    }


}
