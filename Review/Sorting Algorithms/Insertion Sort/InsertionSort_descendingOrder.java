
public class InsertionSort {

	public static void main(String[] args) {
		int[] a = {2, 6, 1, 4, 7};
		
		System.out.println("Initial list: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		for (int i = 1; i < a.length; ++i) { 
            int key = a[i]; 
            int j = i - 1; 
  
            while (j >= 0 && a[j] < key) { 
            	a[j + 1] = a[j];
            	j = j - 1; 
            } 
         
            a[j + 1] = key; 
		}
		
		System.out.println("\n");
		System.out.println("New list: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}	
}
