
package doubly_linked_list_insertion_and_print;

import java.util.Scanner;
import javafx.beans.binding.Bindings;


public class Doubly_linked_list_insertion_and_print {

    node prev;
    node head;
    node next;
    node tail;
    private static class node{
        int data;
        node next;
        node prev;
        public node(int data){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
    public void insertion(int data){
        node newNode = new node(data);
        if(head == null){
            tail = newNode;
        }
        else{
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
        
    }
    public void forwardDisplay(){
        
        if(head == null) return;
        node current = head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
    
    public void backwordDisplay(){
        if(tail == null) return;
        node current = tail;
        
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.prev;
        }
    }
    
    public static void main(String[] args) {
        
        Doubly_linked_list_insertion_and_print ob = new Doubly_linked_list_insertion_and_print();
        Scanner sc = new Scanner(System.in);
        while(true){
            node h = null;
            System.out.println("1 to insert 2 to forword print 3 to backword print");
            int value = sc.nextInt();
            switch(value){
                case 1:
                    int v = sc.nextInt();
                    ob.insertion(v);
                    break;
                 case 2:
                     ob.forwardDisplay();
                     break;
                 case 3:
                     ob.backwordDisplay();
                     break;
                     
            }
        }
    }
   
}
