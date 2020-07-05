// This program finds unique combinations of 3 digits out
// of the following numbers: 1, 2, 3, 4


public class Combination {

	public static void main(String[] args) {
		int count = 0;
		
		for(int i=1; i<5; i++) {
			for(int j=1; j<5; j++) {
				for(int z=1; z<5; z++) {
					if(i != j && i != z && j != z) {
						System.out.println(i + " " + j + " " + z);
						count++;
					}
				}
			}
			
		}
		System.out.println("\n Number of combinations = " + count);
		
	}
	
}



// OUTPUT

/**



1 2 3
1 2 4
1 3 2
1 3 4
1 4 2
1 4 3
2 1 3
2 1 4
2 3 1
2 3 4
2 4 1
2 4 3
3 1 2
3 1 4
3 2 1
3 2 4
3 4 1
3 4 2
4 1 2
4 1 3
4 2 1
4 2 3
4 3 1
4 3 2

 Number of combinations = 24




*/
