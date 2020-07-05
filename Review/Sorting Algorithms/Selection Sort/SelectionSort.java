
public class SelectionSort {
	void selection_sort(int[] a) {
		for (int i = 0; i < a.length-1; i++) 
        { 
            // Finds the smallest element in 
			// the unsorted array 
            int min_index = i; 
            
            for (int j = i+1; j < a.length; j++) 
                if (a[j] < a[min_index])
                	min_index = j; 
                
            // Swaps the smallest element with
            // the first element of the array
            int temp = a[min_index]; 
            a[min_index] = a[i]; 
            a[i] = temp; 
        }
	}
	
	void display(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] a = {64,25,12,22,11}; 
		
		SelectionSort test = new SelectionSort();
		
		// Displays initial list
		System.out.println("Initial list: ");
		test.display(a);
		
		// Sorts the elements in the list
		test.selection_sort(a);
		
		// Displays the sorted list
		System.out.println("\n");
		System.out.println("Sorted list: ");
		test.display(a);
		
	}

}
