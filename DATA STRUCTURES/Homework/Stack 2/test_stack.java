import java.util.Stack;

public class test_stack {

	public static void main(String[] args) {
		Stack<Integer> list = new Stack<Integer>();
		
		System.out.println("Is stack empty?");
		System.out.println(list.isEmpty());
		
		System.out.println("\n Pushing elements in the stack:");
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		list.push(6);
		list.push(7);
		list.push(8);
		list.push(9);

		System.out.println("Is the stack empty?");
		System.out.println(list.isEmpty());
		
		System.out.println("\n Display list: ");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}
		
		System.out.println("\n Last element pushed: ");
		System.out.println(list.peek());
		
		System.out.println("\n Deletion of a few elements: ");
		list.pop();
		list.pop();
		list.pop();
		
		System.out.println("Is the stack empty?");
		System.out.println(list.isEmpty());
		
		System.out.println("\n Last element pushed: ");
		System.out.println(list.peek());
		
		System.out.println("\n Display list: ");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}
	}

}

