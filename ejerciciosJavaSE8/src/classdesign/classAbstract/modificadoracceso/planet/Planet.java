
package classdesign.classAbstract.modificadoracceso.planet;

public abstract class Planet {
   private static int i;
   protected void revolve(){}
    
   abstract void rotate();

}

class Earth extends Planet{

/*

    // no compila porque default es menos accesible que protected
    // para que funcione se debe de usar el modificador de acceso public o protected
    void revolve(){}
  
*/
   protected void rotate() {}
    
    

}