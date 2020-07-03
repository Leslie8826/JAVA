
public class MyLinkedList {
	private MyNode head;
	
	public MyLinkedList() {
		head = null;
	}
	
	public void addFirst(String value) {
		MyNode node = new MyNode(value);
		
		node.next = head;
		head = node;
	}
	
	public void display() {
		MyNode node  = head;
		
		while(node.next != null) {
			System.out.print(node.value + " --> ");
			node = node.next;
		}
		
		System.out.println(node.value);
	}
}
