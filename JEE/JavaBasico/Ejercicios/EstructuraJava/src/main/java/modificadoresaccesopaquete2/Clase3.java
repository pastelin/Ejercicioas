package modificadoresaccesopaquete2;

import modificadoresaccesopaquete1.Clase1;

public class Clase3 extends Clase1 {

    public Clase3() {

        // Prueba de constructores de la clase1
        super("uno", "dos"); // podemos hacer uso de los elementos marcados como protegidos
        new Clase1();
        //new Clase1("uno", "dos"); // llamada al constructor protected
        // new Clase1("uno", "dos", "tres"); // llamada al constructor default o package
        // No podemos llamar a constructores privados desde otras clases
        //new Clase1("uno", "dos", "tres", "cuatro");

    }
    
    public void pruebaDesdeClase3() {
        
        Clase1 c1 = new Clase1();
        System.out.println("atributo publico: " + c1.atributoPublico);
        System.out.println("atributo protegido: " + super.atributoProtegido);
        // System.out.println("atributo default o package: " + c1.atributoDefault);
        //System.out.println("atributo privado: " + c1.atributoPrivado);
        
        System.out.println("");
        System.out.println("Metodo publico: " + c1.metodoPublico());
        System.out.println("Metodo protegido: " + super.metodoProtegido());
        //System.out.println("Metodo default o package: " + c1.MetodoDefault());
        //System.out.println("Metodo privado: " + c1.metodoPrivado());
    
    }
    
    public static void main(String[] args) {
        
        Clase3 c3 = new Clase3();
        
        c3.pruebaDesdeClase3();
        
    }
    

}
