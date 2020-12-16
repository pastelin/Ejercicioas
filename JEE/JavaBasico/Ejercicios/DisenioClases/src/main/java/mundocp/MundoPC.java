package mundocp;

import com.gm.mundocp.*;

public class MundoPC {

    public static void main(String[] args) {

        
        int j = 0;
        
        while(j < 2){
        
            int i = 0;
            Orden orden = new Orden();
        
            while (i < 3) {

                Raton raton = new Raton("usb", "dell");
                Teclado teclado = new Teclado("usb", "dell");
                Monitor monitor = new Monitor("dell", 16);
                Computadora computadora = new Computadora("Omen", monitor, teclado, raton, 20500);
                orden.agregarComputadora(computadora);
                i++;

            }
            
            orden.mostrarOrden();
            
            j++;
        }

    }

}
