import java.util.LinkedList;

public class test_LinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		System.out.println("Checking if list is empty:");
		System.out.println(list.isEmpty());
		list.add(5);
		
		System.out.println("\n Checking if list is empty:");
		System.out.println(list.isEmpty());
		
		// Display list
		System.out.println("\n Display list:");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("\n Adding elements");
		list.add(9);
		list.add(88);
		list.add(12);
		list.add(1);
		
		// Display list
		System.out.println("\n Display list:");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

	}

}

