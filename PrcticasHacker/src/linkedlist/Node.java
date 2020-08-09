package linkedlist;

public class Node {

    // Properties
    Node next;
    int data;
    
    // Methods!
    
    // Constructors
    public Node(int newData){
        
        this.data = newData;
        this.next = null;
        
    }
    
    public Node(int newData, Node newNext){
        
        this.data = newData;
        this.next = newNext;
        
    }
    
    // Getters and Setters
    
    public int getData(){
        return this.data;
    }
    
    public Node getNext(){
        return this.next;
    }
    
    public void setData(int newData){
        this.data = newData;
    }
    
    public void setNext(Node newNode){
        this.next = newNode;
    }
    
}
