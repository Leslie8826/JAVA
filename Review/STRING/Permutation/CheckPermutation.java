import java.util.Hashtable;
import java.util.Set;

public class CheckPermutation {
	
	// Method to add the characters of a string into a hashtable 
	// along with their occurences as value 
	public static Hashtable<Character, Integer> charOccurences(String str) {
		Hashtable<Character, Integer> hash = new Hashtable<Character, Integer>();
		for(int i=0; i<str.length(); i++) {
			hash.put(str.charAt(i), 0);
		}
		
		for(int i=0; i<str.length(); i++) {
			if(hash.containsKey(str.charAt(i))) {
				hash.put(str.charAt(i), hash.get(str.charAt(i)) + 1);
			}
		}
		
		return hash;
	}
	
	
	// METHOD TO PRINT A HASHTABLE 
	public static void printHashtable(Hashtable<Character, Integer> h) {
		// getting keySet() into Set
		Set<Character> set1 = h.keySet();
		 
		// for-each loop
		for(Character key : set1) {
			System.out.println("Character "  + key + ", Occurences = "  + h.get(key));
		}
	}
	
	
	public static void isSame(String s1, String s2) {
		int count = 0;
		if(s1.length() == s2.length()) {
			for(int i=0; i<s1.length(); i++) {
				if(s1.charAt(i) == s2.charAt(i)) {
					count++;
				}
			}
			if(count == s1.length() && count == s2.length()) {
				System.out.println(s1 + " and " + s2 + " are identical");
			} else {
				System.out.println(s1 + " and " + s2 + " are not identical");
			}
		} else {
			System.out.println(s1 + " and " + s2 + " does not have the same size!!!");
		}	
	}
	
	
	public static boolean isSame2(String s1, String s2) {
		int count = 0;
		boolean res = false;
		
		if(s1.length() == s2.length()) {
			for(int i=0; i<s1.length(); i++) {
				if(s1.charAt(i) == s2.charAt(i)) {
					count++;
				}
			}
			if(count == s1.length() && count == s2.length()) {
				res=true;
			} else {
				res=false;
			}
		} else {
			res=false;
		}
	
		return res;
	}
	
	
	public static int Compare(Hashtable<Character, Integer> ht1, Hashtable<Character, Integer> ht2) {
		// getting keySet() into Set
        Set<Character> set1 = ht1.keySet();
        
        // for-each loop
		int count = 0;
		for(Character key1 : set1) {
			if(ht1.containsKey(key1) == ht2.containsKey(key1) && ht1.get(key1) == ht1.get(key1)) {
				count++;
			}
		}
		return count;
	}
	
	
	
	public static void isPermutation(String s1, String s2, Hashtable<Character, Integer> ht1, Hashtable<Character, Integer> ht2) {
		// getting keySet() into Set
        Set<Character> set = ht1.keySet();
        
        // for-each loop
		int count = 0;
		for(Character key1 : set) {
			if(ht1.containsKey(key1) == ht2.containsKey(key1) && ht1.get(key1) == ht1.get(key1)) {
				count++; // counts the number of times we found ourselves in the following at the same time :
						//    - characters in string 1 contains characters in string 2
						 //   - characters in string 1 have the same occurences than characters in string 2
			}
		}
		
		
		boolean bool = isSame2(s1, s2);
		if(count == ht1.size() && count == ht2.size() && bool == false && s1.length() == s2.length())
			System.out.println("'" + s1 + "' is a permutation of '" + s2 + "'");
		else
			System.out.println("'" + s1 + "' is a not permutation of '" + s2 + "'");
	}
	
	
	public static void main(String[] args) {
		String s1 = "totooo";
		String s2 = "toooto";
		Hashtable<Character, Integer> ht1;
		Hashtable<Character, Integer> ht2;
		
		// Inserts s1 to a hashtable
		ht1 = charOccurences(s1);
		
		// Inserts s2 to a hashtable
		ht2 = charOccurences(s2);
		
		// PRINT HASHTABLE 1
		System.out.println("STRING 1:");
		printHashtable(ht1);
		
		// PRINT HASHTABLE 2
		System.out.println("\n");
		System.out.println("STRING 2:");
		printHashtable(ht2);
	
		System.out.println("\n Are strings similar?");
		isSame(s1, s2);
		System.out.println("\n Are strings similar?");
		isSame2(s1, s2);
		System.out.println(isSame2(s1, s2));
		
		// Compare the 2 hashtables
		System.out.println("\n");
		System.out.println("Comparison:");
		isPermutation(s1, s2, ht1, ht2);
	}
}

/*************************************
********** OUTPUT ********************

STRING 1:
Character t, Occurences = 2
Character o, Occurences = 4


STRING 2:
Character t, Occurences = 2
Character o, Occurences = 4

 Are strings similar?
totooo and toooto are not identical

 Are strings similar?
false


Comparison:
'totooo' is a permutation of 'toooto'

*/



/*********************************
************** OUTPUT 2 **********

STRING 1:
Character t, Occurences = 2
Character o, Occurences = 1


STRING 2:
Character t, Occurences = 2
Character o, Occurences = 2

 Are strings similar?
tot and toto does not have the same size!!!

 Are strings similar?
false


Comparison:
'tot' is a not permutation of 'toto'

*********/




/*****************************
********** OUTPUT 3 **********

STRING 1:
Character t, Occurences = 2
Character o, Occurences = 2


STRING 2:
Character t, Occurences = 2
Character o, Occurences = 2

 Are strings similar?
toto and toto are identical

 Are strings similar?
true

Comparison:
'toto' is a not permutation of 'toto'

***********/



