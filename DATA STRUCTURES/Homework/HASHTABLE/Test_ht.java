
/**
 * 
 * This program list distinct characters and counts the number of times 
 * each appears in a given string
 * 
 * **/

//import java.util.Hashtable;
//import java.util.Enumeration;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hellooo";
		Hashtable<Character, Integer> count = new Hashtable<Character, Integer>();
		Set<Character> keys = count.keySet();
		
		// Adds the characters from string into the hashtable
		for(int i=0; i<str.length(); i++) {
			count.put(str.charAt(i), 0);
		}
		
    // Prints incomplete hashtable
		System.out.println("Incomplete hashtable:");
		System.out.print(count);
		
    // insert values of corresponding each key into hashtable
		for(Character key : keys) {
			int countKeys=0;
			for(int i=0; i<str.length(); i++) {
				if(key == str.charAt(i)) {
					countKeys++;
					count.put(key, countKeys);
				}
			}
		}
		
		
		// Prints hashtable with enumeration interface
		Enumeration<Character> enumeration = count.keys();
		
		System.out.println("\n");
		System.out.println("Complete hashtable:");
		while(enumeration.hasMoreElements()) {
			Character key2 = enumeration.nextElement();
			System.out.println("character: "+ key2 + ", occurence = " + count.get(key2));
		}

	}

}


/**

OUTPUT

Incomplete hashtable:
{l=0, H=0, e=0, o=0}

Complete hashtable:
character: l, occurence = 2
character: H, occurence = 1
character: e, occurence = 1
character: o, occurence = 3


**/
