public class MyStack {
	int max = 10;
	int top = -1;
	int index = 0;
	int[] a = new int[max];
	
	// isEmpty method
	boolean isEmpty() {
		if(top < 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// push method
	int push(int numb) {
		a[index] = numb;
		top = a[index];
		index = index+1;
		
		return index;
	}
	
	// display method
	void display() {
		if(index==0) {
			System.out.print(a[0] + " ");
		} else {
			for(int i=0; i<index; i++) {
				System.out.print(a[i] + " ");
			}
		}
	}
	
	// Peek method
	void peek() {
		if(index < 0) {
			System.out.println(" No element in the stack!!");
		} else if(index > 0){
			System.out.println(a[index-1]);
		} else if(index == 0) {
			System.out.println(a[0]);
		}
	}
	
	// Pop method
	int pop() {
		a[index-1] = 0;
		index = index - 1;
		return index;
	}
	
}

