
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
	public void insert(int data) {
		node newNode = new node(data);
		
		if(last==null) {
			first=newNode;
		}
		newNode.next = last;
		last = newNode;
		first.next = last;
	}
	//display
	public void display() {
		node current = last;
		if(last == null) {
			return;
		}
		while(current!=first) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println(current.data);
	}
	public static void main(String[] args) {
		Circular_Singly_linked_list_implementation ob = new Circular_Singly_linked_list_implementation();
		ob.insert(10);
		ob.insert(20);
		ob.insert(30);
		
		ob.display();
	}
}
