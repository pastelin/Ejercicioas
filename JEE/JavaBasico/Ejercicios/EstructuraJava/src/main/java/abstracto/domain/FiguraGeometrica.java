package abstracto.domain;

/**
 *
 * @author Juan Pastelin Brioso
 *
 * @version 1.0
 */
public abstract class FiguraGeometrica {

    protected String tipoFigura;
    
    public FiguraGeometrica(String tipoFigura) {
        
        this.tipoFigura = tipoFigura;
        
    }
    
    // La clase padre no define el comportamiento
    public abstract void dibujar();
    
    public String getTipoFigura() {
        return this.tipoFigura;
    }
    
    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + "}";
    }
    
}
