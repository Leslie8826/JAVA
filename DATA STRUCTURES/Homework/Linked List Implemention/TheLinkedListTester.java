public class TheLinkedListTester {

	public static void main(String[] args) {
		TheLinkedList linkedList = new TheLinkedList();
		
		linkedList.addFirst("Paris");
		
		System.out.println("Dislay 1:");
		linkedList.display();
		
		linkedList.addLast("Montreal");
		
		System.out.println("\n Dislay 2:");
		linkedList.display(); 
		
		
		linkedList.addLast("Beijing");
		linkedList.addFirst("New York");
		
		System.out.println("\n Dislay 3:");
		linkedList.display(); 
		
		linkedList.addAfter("Paris", "Tokyo");
		
		System.out.println("\n Dislay 4:");
		linkedList.display();
		
		linkedList.addAfter("Tokyo", "Toronto");
		System.out.println("\n Dislay 5:");
		linkedList.display();
	}

}

