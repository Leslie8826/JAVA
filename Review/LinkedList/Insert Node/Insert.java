import java.util.*;

public class Insert {
  // Method that takes an integer and a LinkedList of integers as parameters and return a linkedList
	public static LinkedList<Integer> insertData(int d, LinkedList<Integer> ll) {
    // case where element to be added is less than first element of the list
		if(d < ll.get(0)) {
			ll.add(0, d);
      // case where element to be added is between first element of the list and last element of the list
		} else if (d > ll.get(0) && d < ll.get(ll.size()-1)){ 
			for(int i=0; i<ll.size(); i++) {
				if(d > ll.get(i) && d < ll.get(i+1)) {
					ll.add(i+1, d);
				}
			}
      // case where element to be added is greater than the last element of the list
		} else if(d > ll.get(ll.size()-1)){
			ll.add(ll.size(), d);
		}
		
    // returns new list
		return ll;
    }
	
	
	public static void main(String[] args) {
    // Creates a nex LinkedList of unknown data type
		LinkedList l = new LinkedList();
		
    // Adds elements in the LinkedList
		l.add(1);
		l.add(6);
		l.add(9);
		l.add(15);
		l.add(91);
		
    // Prints LinkedList
		System.out.println("Initial list: ");
		for(int i=0; i<l.size(); i++) {
			System.out.print(l.get(i) + " ");
		}
		
		System.out.println("\n ");
		System.out.println("New List: ");
		insertData(99, l);
		
		for(int i=0; i<l.size(); i++) {
			System.out.print(l.get(i) + " ");
		}
	}

}

