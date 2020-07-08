
public class MyStack_Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyStack stack = new MyStack();
		System.out.println("Is Stack empty? --> " + stack.isEmpty());
		
		System.out.println("\n Add 4:");
		stack.push(4);
		stack.display();
		System.out.println("\n Is Stack empty? --> " + stack.isEmpty());
		
		System.out.println("\n Add 5:");
		stack.push(5);
		stack.display();
		
		System.out.println("\n Add 0:");
		stack.push(0);
		stack.display();
		
		System.out.println("\n Add -6:");
		stack.push(-6);
		stack.display();
		
	    System.out.println("Top element in stack =  " + stack.peek());
	    
	    System.out.println("\n Remove top element:");
	    stack.pop();
	    stack.display();
	    
	    System.out.println("\n Remove top element:");
	    stack.pop();
	    stack.display();
	    
	}

}
