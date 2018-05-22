
public class Doubly_linked_List_delete_head_node {

	node tail;
	node head;
	//structure class for assign node 
	private static class node{
		int data;
		node next;
		node prev;
		public node(int data) {
			this.data = data;
			this.next = next;
			this.prev = prev;
		}
	}
	//function for inserting data
	public void insertEnd(int data) {
	    node newNode = new node(data);
	    if(head == null) {
	    	head = newNode;
	    }
	    else {
	    	tail.next = newNode;
	    	newNode.prev = tail;
	    }
	    tail = newNode;
	}
	
	//display all value
	public void display() {
		node current = head;
		if(current == null) return;
		
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("null");
	}
	//deleteFirst
	public void delete() {
		
		if(head == tail) {
			tail = null;
		}
		if(head != null) {
			head.next.prev = null;
			
		}
		head = head.next;
	}
	public static void main(String[] args) {
		Doubly_linked_List_delete_head_node ob = new Doubly_linked_List_delete_head_node();
		
		ob.insertEnd(10);
		ob.insertEnd(20);
		ob.insertEnd(30);
		
		ob.delete();
		ob.delete();
		ob.delete();
		ob.display();
	}

}
