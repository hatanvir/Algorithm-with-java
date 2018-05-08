
package singly_linkedlist;

public class Singly_linkedlist {
    public void display(node head){
        
		node current = head;
		if(current == null){
                    return;
                }
		while(current != null){
			System.out.print(current.value+"--> ");
                        current=current.next;
		}
                System.out.println(current);
                
	}
	
	private static class node{
		private int value;
		private node next;
                
		public node(int value){
			this.value=value;
			this.next=null;
		}
	}
        
        //inserting on end of the linked list
        public node end(node head,int data){
            node newNode = new node(data);
            if(head == null){
                return newNode;
            }
            node current = head;
            while(null!=current.next){
                current=current.next;
            }
            current.next=newNode;
            return head;
        }
        //inserting on beginning of the linked list
        public node beginning(node head,int data){
            node newNode = new node(data);
            newNode.next = head;
            head = newNode;
            return head;
        }
        //inserting newNode after given a specific node
        public node specificNode(node head,node specificNode,int data){
            node newNode = new node(data);
            node privious = head;
            node current = head;
            while(current.next != null){
                current = current.next;
            }
            newNode.next = privious.next;
            privious.next = newNode;
            return head;
        }
        public node position(node head,int data,int position){
            node newNode = new node(data);
            int count = 1;
            node privious = head;
            while(count<position-1){
                privious = privious.next;
                count++;
            }
            newNode.next = privious.next;
            privious.next = newNode;
            
            return head;
        }
	public static void main(String[] args) {
            Singly_linkedlist ob = new Singly_linkedlist();
            
            node head = new node(1);
	    node second = new node(2);
	    node third = new node(3);
		
	    head.next = second;
	    second.next = third;
            
            ob.display(head);
            //function call for insert on end of the linked list
            node newNode = ob.end(head, 20);
            ob.display(newNode);
            
            //function call for insert on beginning of the linked list
            node newNodee = ob.beginning(head, 40);
            ob.display(newNodee);
            
            //function call for insert newNode after given a specific node
            node spnewNode = ob.specificNode(head,second, 100);
            ob.display(spnewNode);
            
            //function call for insert newNode in a given position
            node Position = ob.position(head,200,4);
            ob.display(Position);
	}
}

