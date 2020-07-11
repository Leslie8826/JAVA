/**
 * This progrqm implements an algorithm to determine if a string 
 * has all unique characters using a function.
 * 
 **/

import java.util.Hashtable;
import java.util.Set;

public class Unique {
	
	public void CheckUniqueness(String str) {
		// Creates a key-value hashtable 
		// key: characters, 
		// value: number of occurences of each character in string
		Hashtable<Character, Integer> string_check = new Hashtable<Character, Integer>();
		Set<Character> keys = string_check.keySet();
		
		// Inserts characters as keys in the hashtable
		// Assigns 0 as value to each key
		for(int i=0; i<str.length(); i++) {
			string_check.put(str.charAt(i), 0);
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
	    
	 // if any character has a corresponding value greater than 1
	    // this character is not unique hence
	    // the string is not unique
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

	public static void main(String[] args) {
		String str1 = "cbat";
		String str2 = "I'm singing in the rain!!! What about you";
		Unique test = new Unique();
		
		System.out.println("String 1: ");
		for(int i=0; i<str1.length(); i++) {
			System.out.print(str1.charAt(i) + " ");
		}
		
		System.out.println("");
	    test.CheckUniqueness(str1); 
	    
	    System.out.println("\n");
	    System.out.println("String 2: ");
		for(int i=0; i<str2.length(); i++) {
			System.out.print(str2.charAt(i) + " ");
		}
		
		System.out.println("");
	    test.CheckUniqueness(str2); 
	}
}

