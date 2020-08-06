/**
**
** Given two arrays, this programs writes a function to compute their intersection.
** Each element in the result should appear as many times as it shows in both arrays.
**
**/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Intersection2arrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		// Stores elements of array 1 in hashset 1
		// so that only unique elements appear in hashset 1
		HashMap<Integer, Integer> n1 = new HashMap<Integer, Integer>();
		for(int i=0; i<nums1.length; i++) {
			n1.put(nums1[i], 0);
		}
		
		for(int i=0; i<nums1.length; i++) {
			if(n1.containsKey(nums1[i])) {
				n1.put(nums1[i], n1.get(nums1[i])+1);
			}
		}
		
		// Stores elements of array 2 in hashset 2
		// so that only unique elements appear in hashset 2
		HashMap<Integer, Integer> n2 = new HashMap<Integer, Integer>();
		for(int i=0; i<nums2.length; i++) {
			n2.put(nums2[i], 0);
		}
		
		for(int i=0; i<nums2.length; i++) {
			if(n2.containsKey(nums2[i])) {
				n2.put(nums2[i], n2.get(nums2[i])+1);
			}
		}
		
		Set<Integer> set = n1.keySet();
		// When looping through hashset 1, if element from hashset 1 appear in hashset 2
		// then it is an intersection and we store it in arraylist 
		for(int i : set) {
			if(n2.containsKey(i)) {
				if(n1.get(i) < n2.get(i)) {
					for(int j=0; j<n1.get(i); j++) {
						res.add(i);
					}
				} else {
					for(int j=0; j<n2.get(i); j++) {
						res.add(i);
					}
				}		
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
		
		int[] nums1 = {4,9,5, 4, 4, 4, 9, 2};
		int[] nums2 = {9,4,9,8,4, 2};
		int[] results;
		
		
		Intersection2arrays test = new Intersection2arrays();
		
		results = test.intersection(nums1, nums2);
		
		for(int i=0; i<results.length; i++) {
			System.out.print(results[i] + " ");
		}
		
		
		
	}
}
