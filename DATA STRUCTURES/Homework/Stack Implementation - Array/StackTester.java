
public class StackTester {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		System.out.println("Is the stack empty? \n " + stack.isEmpty());
		
		System.out.println("\n Push 3 in stack: ");
		stack.push(3);
		
		System.out.println("\n Is the stack empty? \n " + stack.isEmpty());
		
		System.out.println("\n Push 1 in stack: ");
		stack.push(1);
		System.out.println("\n Push 9 in stack: ");
		stack.push(9);
		System.out.println("\n Push 12 in stack: ");
		stack.push(12);
		System.out.println("\n Push 155 in stack: ");
		stack.push(155);
		
		System.out.print("\n Stack elements: ");
		stack.display();
		System.out.println("\n Peek: ");
		stack.peek();
		
		System.out.println("\n Pop action ");
		stack.pop();
		System.out.print("\n Stack elements: ");
		stack.display();
		System.out.println("\n Peek: ");
		stack.peek();
		
		System.out.println("\n Pop action ");
		stack.pop();
		System.out.print("\n Stack elements: ");
		stack.display();
		System.out.println("\n Peek: ");
		stack.peek();
		
		System.out.println("\n Pop action ");
		stack.pop();
		System.out.print("\n Stack elements: ");
		stack.display();
		System.out.println("\n Peek: ");
		stack.peek();
		
		System.out.println("\n Pop action ");
		stack.pop();
		System.out.print("\n Stack elements: ");
		stack.display();
		System.out.println("\n Peek: ");
		stack.peek();
	
		System.out.println("\n Pop action ");
		stack.pop();
		System.out.print("\n Stack elements: ");
		stack.display();
		System.out.println("\n Peek: ");
		stack.peek();
	}
}

