package enumeraciones;

/**
 * Ejemplo de uso de enum usando atributos, constructor y metodos 
 * 
 * @author Juan Pastelin Brioso
 * @version 1.0
 */
public enum Continentes {
    
    /**
     * Declaracion de continentes y uso de constructor para la asignacion del 
     * numero de paises
     */
    
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
    
    /**
     * Atributo de paises
     */
    private final int paises;
    
    /**
     * Constructor de cada elemento de la numeracion recibe un argumento
     * @param paises es el numero de paises
     */
    Continentes(int paises){
        this.paises = paises;
    }
    
    /**
     * @return int numero de paises en un continente 
     */
    public int getPaises(){
        return this.paises;
    }
    
    
}
