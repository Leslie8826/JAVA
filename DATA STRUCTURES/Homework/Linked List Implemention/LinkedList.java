
public class TheLinkedList {
	private Node head;

	public TheLinkedList() {
		head = null;
	}
	
	// Creates a node with a value and adds it at 
	// the first position of the linked list
	public void addFirst(String value) {
		Node node = new Node(value);
		node.next = head;
		head = node;
	}
	
	// Creates a node with a value and adds it 
	// at the last position of the linked list
	public void addLast(String value) {
		Node node = new Node(value);
		Node i = head;

		while (i.next != null) {
			i = i.next;
		}
		
		i.next = node;
	}

	
	// Creates a node with a value and adds it after 
	// another node with a certain value
	public void addAfter(String afterValue, String newValue) {
		Node node = new Node(newValue);
		Node i = head;

		while (i.value != afterValue) {
			i = i.next;
		}
		
		node.next = i.next;
		i.next = node;
	}
	
	// Displays the Linked List
	public void display() {
		Node i = head;
		
		System.out.println("The linked list:");

		while (i.next != null) {
			System.out.print(i.value + " ---> ");
			i = i.next;
		}
		
		System.out.println(i.value);
	}

}

