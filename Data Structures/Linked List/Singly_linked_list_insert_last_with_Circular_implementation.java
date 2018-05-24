
public class Circular_singly_linked_list_insert_last {

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
	public void insertLast(int data) {
		node newNode = new node(data);
		
		if(last==null) {
			last=newNode;
			newNode.next = last;
		}
		else {
			newNode.next = last.next;
			last.next = newNode;
			last = newNode;
		}
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
		Circular_singly_linked_list_insert_last ob = new Circular_singly_linked_list_insert_last();
		ob.insertLast(10);
		ob.insertLast(20);
		ob.insertLast(30);
		
		ob.display();
	}

}
