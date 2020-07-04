
package methodsandescapsulations.ejercicio1;


public class Student {

    private double marks1, marks2, marks3;
    public static double maxMarks = 100;
    
    public double getAverage(){
        
        double avg = 0;
        avg = ((marks1 + marks2) / (marks3 * 3)) * 100;
        return avg;
    }
    
    public void setAverage(double val){
        
        // genera un error ya que no está definida como global
        // avg = val;
    
    }
    
    void x(int i){ System.out.println("1"); }
    void x(String s){ System.out.println("2"); }
    void x(double d){ System.out.println("3"); }

    
    
    public static void main(String[] args) {
        
        new Student().x(1.1);
        
    }
    
}
