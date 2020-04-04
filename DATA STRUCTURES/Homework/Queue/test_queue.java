import java.util.LinkedList;
import java.util.Queue;

public class test_queue {
	public static void main(String[] args) {
		Queue<Integer> list = new LinkedList<Integer>();
		
		System.out.println("Checking if queue is empty:");
		System.out.println(list.isEmpty());
		
		System.out.println("\n Enqueue elements:");
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		
		System.out.println("\n Checking if queue is empty:");
		System.out.println(list.isEmpty());
		
		System.out.println("\n Display list: ");
		System.out.print("Front " + list + " Rear");
		
		System.out.println("\n\n Dequeue elements:");
		list.remove();
		list.remove();
		list.remove();
		
		System.out.println("\n Display list: ");
		System.out.print("Front " + list + " Rear");
		
	}

}

