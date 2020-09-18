package modificadoresaccesopaquete1;

public class Clase1 {
    
    // Definicion de atributos
    public String atributoPublico = "Valor atributo publico";
    protected String atributoProtegido = "Valor atributo protegido";
    String atributoDefault = "Valor atributo default";
    private String atributoPrivate = "Valor atributo privado";
    
    
    // Constructores
    public Clase1(){
        System.out.println("Constructor publico vacio");
    }
    
    public Clase1(String texto){
        System.out.println("Constructor public con un argumento = " + texto);
    }
    
    protected Clase1(String texto1, String texto2){
        System.out.println("Constructor protected con dos argumentos: " + texto1 + " " + texto2);
    }
    
    Clase1(String texto1, String texto2, String texto3){
        System.out.println("Constructor default o package");
    }
    
    private Clase1(String texto1, String texto2, String texto3, String texto4){
        System.out.println("Constructor priado");
    }
    
    // Metodos de la clase
    public String metodoPublico(){
        return "Metodo publico";
    }
    
    protected String metodoProtegido(){
        return "Metodo protegido";
    }
    
    String MetodoDefault(){
        return "Metodo default o packkage";
    }
    
    private String MetodoPrivate(){
        return "Metodo private";
    }
    
    
}
