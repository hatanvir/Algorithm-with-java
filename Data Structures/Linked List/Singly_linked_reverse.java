
package singly_linked_reverse;


public class Singly_linked_reverse {

    private static class node{
        int data;
        node next;
        public node(int data){
            this.data = data;
            this.next = next;
        }
    }
    public void display(node head){
        node current = head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println(current);
    }
    public node reverse(node head){
        if(head == null){
            System.out.println(head);
        }
        node current = head;
        node c = head;
        node privious = null;
        node next = null;
        
        while(current != null){
            next = current.next;
            current.next = privious;
            privious = current;
            current = next;
        }
        return privious;
    }
    public void reversePrint(node head){
        if(head == null) return;
        
        reversePrint(head.next);
        System.out.print(head.data+"-->");
        
    }
        
    public static void main(String[] args) {
        Singly_linked_reverse ob = new Singly_linked_reverse();
        
        node head = new node(1);
        node second = new node(2);
        node third = new node(3);
        
        head.next = second;
        second.next = third;

        ob.display(head);
        
        ob.reversePrint(head);
        System.out.println();
        node reve = ob.reverse(head);
        ob.display(reve);
        
        
    }
    
}
