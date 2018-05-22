
package singly_linkedlist_search_element;


public class Singly_linkedlist_search_element {
    
    private static class node{
        int data;
        node next;
        public node(int data){
            this.data = data;
            this.next = next;
        }
    }
    public boolean search(node head,int data){
        node current = head;
        
        while(current != null){
            if(current.data == data){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public static void main(String[] args) {
       
        Singly_linkedlist_search_element ob = new Singly_linkedlist_search_element();
        
        node head = new node(1);
        node second = new node(2);
        node third = new node(3);
        
        head.next = second;
        second.next = third;
        
        int value = 2;
        boolean b = ob.search(head, value);
        
        if(b) System.out.println(value+" is here !");
        else System.out.println("This element is not here.Sorry :( !");
    }
    
}
