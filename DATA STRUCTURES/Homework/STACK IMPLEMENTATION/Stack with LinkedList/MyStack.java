public class MyStack {
	MyNode top;
	
	MyStack(){
		this.top = null;
	}
	
	// Insert an element in stack
	public void push(int v) {
		MyNode node = new MyNode(v);
		
		node.next = top;
		top = node;
	}
	
	// Checks is a stack is empty
	public boolean isEmpty() {
		// check for stack underflow 
        if (top == null) { 
            System.out.print("\nStack Underflow"); 
        }
		
		return top == null;
	}
	
	// Displays data of top node
	public void peek() {
		if(!isEmpty()) {
			System.out.println(top.data);
		}
		else {
			System.out.println("Stack is empty!");
		}
	}
	
	public void pop() {
		top = top.next;
	}
	
	public int pop2() {
		top = top.next;
		return top.data;
	}
	
	
	public int min() { 
		int ref = min();
		int p = pop2();
		
		if(ref < p) {
			ref=p;
			return ref;
		}
		
		return ref;
	}
	
	public void display() {
		MyNode node = top;
		
		while(node.next != null) {
			System.out.print(node.data + " -> ");
			node=node.next;
		}
		
		System.out.println(node.data);
	}
}
