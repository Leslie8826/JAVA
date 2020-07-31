// This queue is for data that are all different from 0
public class MyQueue {
	int maxSize = 20;
	int[] array = new int[maxSize];
	
	// Defines the size of the array that contains 
	// the values (the ones that are different from 0) 
	public int getRealSize() {
		int count = 0;
		
		for(int i=0; i<array.length; i++) {
			if(array[i] != 0)
				count++;
		}
		
		return count;
	}
	
	
	// Adds data to the queue
	public void enqueue(int data) {
		for(int i=0; i<array.length; i++) {
			if(array[i] == 0) {
				array[i] = data;
				break;
			}
		}
	}
	
	
	// Removes data from the queue
	public void dequeue() {
		for(int i=0; i<getRealSize(); i++) {
			array[i] = array[i+1];
		}
	}
	
	
	// Displays the value at the beginning of queue 
	public void front() {
		System.out.println(array[0]);
	}
	
	// Displays the value at the end of the queue
	public void rear() {
		System.out.println(array[getRealSize()-1]);
	}
	
	// Displays all value from queue (following the FIFO order)
	public void display() {
		for(int i=0; i<getRealSize(); i++) {
			System.out.print(array[i] + " ");
		}
	}
}
