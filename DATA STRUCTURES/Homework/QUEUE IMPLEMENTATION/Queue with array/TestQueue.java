
public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyQueue queue = new MyQueue();
		
		queue.enqueue(1);
		System.out.println("...Add 1...");
		System.out.println("Size = " + queue.getRealSize());
		System.out.println("Queue: ");
		queue.display();
		
		queue.enqueue(2);
		System.out.println("\n");
		System.out.println("...Add 2...");
		System.out.println("Size = " + queue.getRealSize());
		System.out.println("Queue: ");
		queue.display();
		
		
		queue.enqueue(3);
		System.out.println("\n");
		System.out.println("...Add 3...");
		System.out.println("Size = " + queue.getRealSize());
		System.out.println("Queue: ");
		queue.display();
		
		
		queue.enqueue(4);
		System.out.println("\n");
		System.out.println("...Add 4...");
		System.out.println("Size = " + queue.getRealSize());
		System.out.println("Queue: ");
		queue.display();
		
		queue.enqueue(5);
		System.out.println("\n");
		System.out.println("...Add 5...");
		System.out.println("Size = " + queue.getRealSize());
		System.out.println("Queue: ");
		queue.display();
		
		
		System.out.println("\n");
		System.out.println("Dequeue: ");
		queue.dequeue();
		queue.display();
		
		System.out.println("\n");
		System.out.println("Dequeue: ");
		queue.dequeue();
		queue.display();
		
		System.out.println("\n");
		System.out.println("Front: ");
		queue.front();
		System.out.println("Rear: ");
		queue.rear();

	}

}

