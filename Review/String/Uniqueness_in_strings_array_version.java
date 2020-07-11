/**
 * This program implements an algorithm to determine if a string has all unique characters. 
 *
 **/
 
public class Uniqueness_in_strings_array_version {

	public static void main(String[] args) {
		//String str = "cbaaaaadt";
		String str = "Qcbadt";
		int[] occurences = new int[str.length()];
		
		// Prints all characters of string 
		System.out.println("String: ");
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}

		// Creates an array of integers that represent the number of occurences
		// in the string.
		// integer in array at index i will correspond to the number of occurences 
		// of character in string at index i
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					occurences[i] = occurences[i] + 1;
				}
			}
		}
		
		// prints array of occurences
		System.out.println("");
		for(int i=0; i<occurences.length; i++) {
			System.out.print(occurences[i] + " ");
		}
		
		
		// We loop through the array of occurences and
		// when we found an occurence that is greater than 1,
		// that means the corresponding character appears more 
		// than once in the string.
		// Hence the string has not all unique characters
		
		
		int count = 0;// will count the number of times a character appears more than once
		System.out.println("\n ");
		
		for(int y=0; y<occurences.length; y++) {
			// we count the number of times a character appears more than once
			if(occurences[y] > 1)
				count++;
		}
		
		// if no character appears more than once then
		// all characters in string are unique
		if(count == 0) 
			System.out.println("STRING IS UNIQUE");
		else
			System.out.println("STRING IS NOT UNIQUE");
			
	}
}

