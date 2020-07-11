
// This program implements an algorithm to determine if a string has all unique characters. 
import java.util.Hashtable;
import java.util.Set;
 
public class Unique {

	public static void main(String[] args) {
		String str = "cbaaaaadt";
		// String str = "I'm singing in the rain!!! What about you";
		// String str = "abcdefghh";
		
		// Creates a key-value hashtable 
		// key: characters, 
		// value: number of occurences of each character in string
		Hashtable<Character, Integer> string_check = new Hashtable<Character, Integer>();
		
		System.out.println("The String to be studied: ");
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		
		// Inserts characters as keys in the hashtable
		// Assigns zero as value to each key
		for(int i=0; i<str.length(); i++) {
			string_check.put(str.charAt(i), 0);
		}
		
		// Two ways to print the hashtable
		// WAY 1
		System.out.println("\n");
		System.out.println("Initial hashtable (way 1 of printing):");
	    System.out.print(string_check + " ");
	    
	    // WAY 2
	    System.out.println("\n");
	    System.out.println("Initial hashtable (way 2 of printing):");
        Set<Character> keys = string_check.keySet();
        for(Character key: keys){
            System.out.println("Value of " + key + " is: " + string_check.get(key));
        }
    
        
        // Compares the characters in hashtable to the characters in string to count them.
        // count will be added as value in hashtable
	    for(Character key: keys){
	    	int count=0;
	    	for(int j=0; j<str.length(); j++) {
	    		if(key == str.charAt(j)) {
		    		count++;
		    		string_check.put(key, count);
		    	}
	    	}
	    }
	    
	    // Print the new hashtable:
	    // characters with their associated number of frequences
	    System.out.println("");
	    System.out.println("New count:");
	    System.out.print(string_check + " ");	
	    
	    
	    // if any character has a corresponding value greater than 1
	    // this character is not unique hence
	    // the string is not unique
	    System.out.println("\n");
	    int count=0;
	    for(Character key : keys) {
	    	if(string_check.get(key) > 1) {
	    		count++;
	    	}   
	    }
	    
	    // checks if string has unique characters
	    if(count > 0) {
	    	System.out.println("STRING DOES NOT HAVE UNIQUE CHARACTERS");
	    } else {
	    	System.out.println("STRING HAS UNIQUE CHARACTERS");
	    }
	}
}

