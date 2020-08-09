package createfile;

import java.io.*;

public class CreateHTML {

    public static void main(String[] args) {
        
        try{
            
            String ruta = "C:\\Cursos/prueba.html";
            String contenido = "<html> <body> <h1>Yeah I can do it ok</h1> </body> </html>";
            
            File file = new File(ruta);
            
            // si el archivo no existe es creado
            
            if(!file.exists()){
                
                file.createNewFile();
                
            }
            
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
            
        }catch(IOException e){
        
           e.getLocalizedMessage();
        
        }
    
    }
    
}
