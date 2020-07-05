// This programs sorts an array using 
// the bubble sort algorithm

public class BubbleSort {
	void bubble_sort(int[] a) {
		int size = a.length;
		int temp=0;
		
		for(int i = 0; i < size - 1; i++) {
			for(int j = 0; j < size - 1 - i; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	void display(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] a = {64, 34, 25, 12, 22, 11, 90};
		BubbleSort test = new BubbleSort();
		
		// Displays initial array
		System.out.println("Initial list:");
		test.display(a);
		
		// Sorts the elements of the array
		test.bubble_sort(a);
		
		System.out.println("\n");
		// Displays new sorted array
		System.out.println("New sorted list: ");
		test.display(a);
	}

}
