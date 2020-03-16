import java.util.Enumeration;
import java.util.Scanner;
import java.util.Stack;

public class string2 {

	public static void main(String[] args) {
		Stack<String> sta = new Stack<String>();
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter a String: ");
		String str = input.nextLine();
		
    // Insert elements in stack
		sta.push(str.toLowerCase());
		sta.push(str.toUpperCase());
		
		Enumeration enu = sta.elements();
		
		// Display elements of stack
		System.out.println("\n Display 1:");
		while (enu.hasMoreElements()) {
			System.out.print(enu.nextElement());
    }
			
		}
	}

}

