
package singly_linkedlist_compare;


public class Singly_linkedlist_compare {

    private static class node1{
       int data;
       node1 next;
       public node1(int data){
           this.data = data;
           this.next = next;
       }
    }
    
    private static class node2{
       int data;
       node2 next;
       public node2(int data){
           this.data = data;
           this.next = next;
       }
    }
    
    public int compare(node1 head1,node2 head2){
        node1 currenr1 = head1;
        node2 currenr2 = head2;
        try{
        while(currenr1 != null || currenr2 != null){
            if(currenr1.data != currenr2.data){
                return 0;
            }
            currenr1 = currenr1.next;
            currenr2 = currenr2.next;
        }
        return 1;
        }
        catch(Exception e){
            return 0;
        }
    }
    
    public static void main(String[] args) {
        
        Singly_linkedlist_compare ob = new Singly_linkedlist_compare();
        
        node1 head1 = new node1(1);
        node1 second1 = new node1(2);
        node1 third1 = new node1(3);
        
        head1.next = second1;
        second1.next = third1;
        
        node2 head2 = new node2(1);
        node2 second2 = new node2(2);
        //node2 third2 = new node2(4);
        
        head2.next = second2;
        //second2.next = third2;
        
        if(ob.compare(head1, head2) == 1) System.out.println("1");
        else System.out.println("0");
    }
    
}
