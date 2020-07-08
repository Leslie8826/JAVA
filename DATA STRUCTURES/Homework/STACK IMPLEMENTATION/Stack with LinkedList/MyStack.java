public class MyStack {
	MyNode top;
	
	MyStack(){
		this.top = null;
	}
	
	public void push(int val) {
		MyNode node = new MyNode(val);
		
		node.next = top;
		top = node;
	}
	
	public boolean isEmpty() {
		return top==null;
	}
	
	public int peek() {
		if(top == null) {
			return -1;
		} else {
			return this.top.data;
		}
	}
	
	
	public void pop() {
		this.top = this.top.next;
	}
	
	
	public void display() {
		MyNode node = this.top;
		
		while(node.next != null) {
			System.out.print(node.data + " -> ");
			node = node.next;
		}
		
		System.out.println(node.data);
	}
}

