
package doubly_linked_list_insert_into_end;


public class Doubly_linked_list_insert_into_end {
    
    node head;
    node tail;
    //node next;
    node prev;
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
    public void insertIntoEnd(int data){
        node newNode = new node(data);
        if(head == null){
            head = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
    }
    public void printFromhead(){
        if(head == null) return;
        
        while(head!=null){
            System.out.print(head.data+"-->");
            head=head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Doubly_linked_list_insert_into_end ob = new Doubly_linked_list_insert_into_end();
        
        ob.insertIntoEnd(10);
        ob.insertIntoEnd(20);
        ob.insertIntoEnd(30);
        ob.insertIntoEnd(40);
        
        ob.printFromhead();
        
        
    }
    
}
