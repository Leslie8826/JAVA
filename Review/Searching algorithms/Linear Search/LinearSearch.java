// This program searches an element in a
// sorted array using a linear search algorithm

public class LinearSearch {
	int linearSearch(int[] a, int x) {
		
		for(int i=0; i<a.length; i++) {
			if(a[i] == x) 
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = {2, 5, 12, 700, 709, 1200};
		int nb = 1200;
		
		LinearSearch test = new LinearSearch();
		
	  int t = test.linearSearch(array, nb);
	    
	  if(t>=0)
	    System.out.println(nb + " is at index " + t);
	  else
	    System.out.println(nb + " cannot be found");
	}
}

