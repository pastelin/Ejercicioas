
package linkedlist;

import java.util.LinkedList;

public class LinkedListUs {

    // Properties
    Node head;
    int count;
    
    // Constructors
    public LinkedListUs(){
        
        this.head = null;
        this.count = 0;
        
    }
    
    public LinkedListUs(Node newHead){
        
        this.head = newHead;
        this.count = 1;
        
    }
    
    // Methods
    
    // add
    public void add(int newData){
        
        Node temp = new Node(newData);
        Node current = head;
        
        while(current.getNext() != null){
            current = current.getNext();
        }
        
        current.setNext(temp);
        count++;
        
    }
    
    // get
    public int get(int index){
        
        if(index <= 0){
            return -1;
        }
        
        Node current = head;
        
        for(int i = 1; i < index; i++){
            
            current = current.getNext();
            
        }
        
        return current.getData();
    }

    // size
    public int size(){
        
        return count;
        
    }
    
    // isEmpty
    public boolean isEmpty(){
        
        return head == null;
        
    }
    
    // remove
    public void remove(){
        
        // remove from de back of the list
        Node current = head;
        
        while(current.getNext().getNext() != null){
            current = current.getNext();
        }
        
        current.setNext(null);
        count--;
        
    }
    
    public static void main(String[] args) {

        Node node = new Node(10);
        
        LinkedListUs linkUs = new LinkedListUs(node);
        
        linkUs.add(20);
        
        linkUs.get(0);
        
//        LinkedList<String> linkedlist = new LinkedList<String>();

//        linkedlist.add("Juan");
//        System.out.println("linkedlist = " + linkedlist);

//        linkedlist.add("Paco");
//        System.out.println("linkedlist = " + linkedlist);
    }
    
    

    
    
}
