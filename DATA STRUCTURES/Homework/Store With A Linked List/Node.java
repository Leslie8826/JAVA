/* Class for a single node. A node consists of a value
 * and a reference (or pointer) to the next node. In 
 * the case of a single node the pointer points to null */

public class Node {
	public String value;
	public Node next;
	
	public Node(String val) {
		value = val;
		next = null;
	}
}

