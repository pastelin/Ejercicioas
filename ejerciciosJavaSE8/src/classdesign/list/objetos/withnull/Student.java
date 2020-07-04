
package classdesign.list.objetos.withnull;

public class Student {

    String name;
    
    public Student(String name){
        
        this.name = name;
        
    }
    
}

class Test{
    
    public static void main(String[] args) {
        
        Student[] students = new Student[3];
        students[1] = new Student("Richard");
        students[2] = new Student("Juan");

        // generara un error porque intentara acceder a un valor nulo
        for(Student student : students){
            System.out.println(student.name);
        }
    }
    
}
