import java.util.HashMap;
import java.util.Set;

public class FindDuplicates {
	public boolean findDup(int[] list) {
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		int dup = 0;
		boolean res = false;
		
		// Adds keys in hashmap from array
		for(int i=0; i<list.length; i++) {
			count.put(list[i], 0);
		}
		
		// counts number of occurences of keys from array
		// and inserts them in hashmap
		for(int i=0; i<list.length; i++) {
			if(count.containsKey(list[i]))
				count.put(list[i], count.get(list[i]) + 1);
		}
		
		// counts nb of times occurences is greater than 1
		// if occurences greater than 1 once then there is a duplicate
		Set<Integer> set = count.keySet();
		for(int i : set) {
			if(count.get(i) > 1)
				dup++;
		}
		
		if(dup>0)
			res = true;
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] list = {1,1,1,3,3,4,3,2,4,2};
		int[] list = {1, 2, 3, 1};
		
		for(int i=0; i<list.length; i++) {
			System.out.print(list[i] + " ");
		}
		
		System.out.println("\n");
		System.out.println("Are there duplicates in list?");
		FindDuplicates test = new FindDuplicates();
		System.out.println(test.findDup(list));
		
	}
}
