    package test;

import abstracto.domain.*;

/**
 *
 * @author Juan Pastelin Brioso
 *
 * @version 1.0
 */
public class EjemploClasesAbstractas {

    public static void main(String[] args) {
        
        // Creacion de objetos
        // FiguraGeometrica figuraGeometrica = new FiguraGeometrica();
        
        FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
        System.out.println("rectangulo = " + rectangulo);
        rectangulo.dibujar();
        
        FiguraGeometrica triangulo = new Triangulo("Triangulo");
        System.out.println("triangulo = " + triangulo);
        triangulo.dibujar();
        
        
    }
    
    
}
