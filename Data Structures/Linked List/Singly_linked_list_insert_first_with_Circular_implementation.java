
public class Circular_Singly_linked_list_implementation {

	node last;
	node first = null;
	//structure class
	private static class node{
		int data;
		node next;
		public node(int data) {
			this.data = data;
			this.next = next;
		}
	}
	//function for inserting data
	public void insertFirst(int data) {
		node newNode = new node(data);
		
		if(last==null) {
			last=newNode;
		}
		else {
			newNode.next = last.next;
		}
		last.next = newNode;
	}
	//display
	public void display() {
		node current = last.next;
		while(current!=last) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println(current.data);
	}
	public static void main(String[] args) {
		Circular_Singly_linked_list_implementation ob = new Circular_Singly_linked_list_implementation();
		ob.insertFirst(10);
		ob.insertFirst(20);
		ob.insertFirst(30);
		
		ob.display();
	}

}
