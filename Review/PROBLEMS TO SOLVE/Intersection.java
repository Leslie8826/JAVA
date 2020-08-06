/*
** 
** Given two arrays, this program writes a function to compute their intersection.
** Each element in the result must be unique.
**
**/

import java.util.ArrayList;
import java.util.HashSet;

public class Intersection {
	public int[] intersection(int[] nums1, int[] nums2) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		// Stores elements of array 1 in hashset 1
		// so that only unique elements appear in hashset 1
		HashSet<Integer> n1 = new HashSet<Integer>();
		for(int i=0; i<nums1.length; i++) {
			n1.add(nums1[i]);
		}
		
		// Stores elements of array 2 in hashset 2
		// so that only unique elements appear in hashset 2
		HashSet<Integer> n2 = new HashSet<Integer>();
		for(int i=0; i<nums2.length; i++) {
			n2.add(nums2[i]);
		}
		
		// When looping through hashset 1, if element from hashset 1 appear in hashset 2
		// then it is an intersection and we store it in arraylist 
		for(int i : n1) {
			if(n2.contains(i)) {
				res.add(i);		
			}
		}
		
		
		
		// We put our values into array from our arraylist
		int[] res2 = new int[res.size()];
		for(int i=0; i<res2.length; i++) {
			res2[i] = res.get(i);
		}
		
		return res2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] nums1 = {1,2,2,1};
		//int[] nums2 = {2,2};
		
		int[] nums1 = {1,4,3,4, 2, 9};
		int[] nums2 = {4, 4, 9, 8, 1, 6};
		int[] results;
		
		Intersection test = new Intersection();
		
		results = test.intersection(nums1, nums2);
		
		for(int i=0; i<results.length; i++) {
			System.out.print(results[i] + " ");
		}
	}
}
