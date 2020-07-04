package classdesign.classAbstract.compatibilidadobjetos.animal;

import java.util.*;

public abstract class Animal {

}

interface Hunter{}

class Cat extends Animal implements Hunter{}

class Tiger extends Cat{}

class Test{

    public static void main(String[] args) {
        
        List<Animal> myList = new ArrayList();
        myList.add(new Cat());
        
        List<Hunter> myList2 = new ArrayList();
        myList2.add(new Tiger());
        
        List<Hunter> myList3 = new ArrayList();
        myList3.add(new Cat());
        
        /*  
        
        // este ejemplo genera un error
        
        
        List<Tiger> myList4 = new ArrayList();
        myList4.add( new Cat());
        
        */
        
    }

}
