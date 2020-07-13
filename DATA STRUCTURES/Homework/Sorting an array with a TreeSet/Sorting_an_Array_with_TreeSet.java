/**
* 
* This program sorts an array of distinct integers using a TreeSet
* 
* */

import java.util.*;

public class Sorting_an_Array_with_TreeSet {
	public static void main(String args[]) {
		int[] a = {77, 23, 4, 66, 99, 112, 45, 56, 39, 89};
		TreeSet<Integer> a_sorted = new TreeSet<Integer>();
	    
		System.out.println("Elements of the array: ");
	    for(int i=0; i<a.length; i++) {
	    	System.out.print(a[i] + "  ");
	    }
	    
	    // Adds elements of array into treeset
	    for(int i=0; i<a.length; i++) {
	    	a_sorted.add(a[i]);
	    }
	    
	    // Prints elements of treeset
	    System.out.println("\n");
	    System.out.println("Elements of the array - sorted with TreeSet: ");
	    System.out.println(a_sorted);
	    
	}
	
}
