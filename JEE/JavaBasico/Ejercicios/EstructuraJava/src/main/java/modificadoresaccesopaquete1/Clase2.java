package modificadoresaccesopaquete1;

public class Clase2 {

    public Clase2(){
        
        // Prueba de constructores de la clase1
        new Clase1();
        new Clase1("uno", "dos");
        new Clase1("uno", "dos", "tres");
        // No podemos llamar a constructores privados desde otras clases
//        new Clase1("uno", "dos", "tres", "cuatro");
        
    } 
    
    public void pruebaDesdeClase2(){
        
        Clase1 c1 = new Clase1();
        System.out.println("atributo publico: " + c1.atributoPublico);
        System.out.println("atributo protegido: " + c1.atributoProtegido);
        System.out.println("atributo default o package: " + c1.atributoDefault);
        //System.out.println("atributo privado: " + c1.atributoPrivado);
        
        System.out.println("");
        System.out.println("Metodo publico: " + c1.metodoPublico());
        System.out.println("Metodo protegido: " + c1.metodoProtegido());
        System.out.println("Metodo default o package: " + c1.MetodoDefault());
        //System.out.println("Metodo privado: " + c1.metodoPrivado());
    
    }
    
    public static void main(String[] args) {
        
        Clase2 c2 = new Clase2();
        
        c2.pruebaDesdeClase2();
        
    }
    
}
