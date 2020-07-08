public class MyStack_Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyStack stack = new MyStack();
		
		System.out.println("Add 5: ");
		stack.push(5);
		stack.display();
		
		System.out.println("Add 10: ");
		stack.push(10);
		stack.display();
		
		System.out.println("Add 16: ");
		stack.push(16);
		stack.display();
		
		System.out.println("\n Add 1: ");
		stack.push(1);
		stack.display();
		
		System.out.println("\n Add 1: ");
		stack.push(3);
		stack.display();
		
		System.out.println("\n Add 1: ");
		stack.push(9);
		stack.display();
		
		System.out.println("\n My stack: ");
		stack.display();
		
		System.out.print("\n Peek = ");
		stack.peek();
		
		System.out.println("");
		System.out.println("Pop:");
		stack.pop();
		stack.display();
		System.out.println("");
		
		System.out.println("Pop:");
		stack.pop();
		stack.display();
		System.out.println("");
		
		System.out.print("Peek = ");
		stack.peek();
	
	}

}
