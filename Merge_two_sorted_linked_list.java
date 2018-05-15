
package merge_two_sorted_linked_list;


public class Merge_two_sorted_linked_list {
    private static class node{
        int data;
        node next;
        public node(int data){
            this.data = data;
            this.next = next;
        }
    }
    private static class node1{
        int data;
        node next;
        public node1(int data){
            this.data = data;
            this.next = next;
        }
    }
    public void display(node head){
        node current = head;
        while(current != null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println(current);
    }
    public node merge(node first,node second){
        
        if(first == null) return second;
        
        if(second == null) return first;
        
        if(first.data < second.data){
            first.next = merge(first.next, second);
            return first;
        }else{
             second.next = merge(first, second.next);
             return second;
        }
    }
    
    public static void main(String[] args) {
       Merge_two_sorted_linked_list ob = new Merge_two_sorted_linked_list();
       
       node head1 = new node(1);
       node second1 = new node(2);
       node third1 = new node(3);
       
       head1.next = second1;
       second1.next = third1;
       
       ob.display(head1);
       
       node head2 = new node(0);
       node second2 = new node(5);
       node third2 = new node(6);
       
       head2.next = second2;
       second2.next = third2;
       
       ob.display(head2);
       
       node m = ob.merge(head1, head2);
       ob.display(m);
       
    }
    
}
