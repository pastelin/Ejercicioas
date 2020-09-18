package abstracto.domain;

/**
 *
 * @author Juan Pastelin Brioso
 *
 * @version 1.0
 */
public class Circulo extends FiguraGeometrica {

    public Circulo(String tipoFigura) {
        
        super(tipoFigura);
        
    }
    
    @Override
    public void dibujar() {
        
        // Agregamos el comportamiento del metodo abstracto
        System.out.println("Aqui deberia dibujar: " + this.getClass().getSimpleName() );
        
    }
    
}
