
public class SinglyLinklist {
	
	public void display(node head){
		node current = head;
		if(current==null) return;
		//while(current!=null){
			//System.out.println(current.value);
		//}
	}
	
	private static class node{
		private int value;
		private node next;
		public node(int value){
			this.value=value;
			this.next=null;
		}
	}
	public static void main(String[] args) {
		node head = new node(1);
		node second = new node(2);
		node third = new node(3);
		
		head.next = second;
		second.next = third;
		
		SinglyLinklist ob = new SinglyLinklist();
		ob.display(head);
	}

}
