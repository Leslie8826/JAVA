// This program rotates a matrix NxN by 90 degrees.
// I considered this 90-degree rotation counterclockwise

public class MatrixRotation {

	public static void main(String[] args) {
		 int q = 2;
		// int q = 3;
		
		//char[][] m = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
		char[][] m = {{'a', 'b'}, {'c', 'd'}};
		char[][] n = new char[q][q];
		int r = 0;
		int c = m.length-1;
		
		for(int j=0; j<n.length; j++) {
			for(int i=0; i<n[0].length; i++) {
				n[i][j] = m[r][c];
				r = r+1;
			}
			c=c-1;
			r=0;
		}
		
		
		// Matrix m
		System.out.println("Matrix m:"); 
		for(int i=0; i<n.length; i++) {
			for(int j=0; j<n[0].length; j++) {
				System.out.print(m[i][j] + " "); 
			}
			System.out.println(" "); 
		}
		
		
		System.out.print("\n"); 
		// Matrix n
		System.out.println("Matrix n:"); 
		for(int j=0; j<n.length; j++) {
			for(int i=0; i<n[0].length; i++) {
				System.out.print(n[i][j] + " "); 
			}
			System.out.println(" "); 
		}

	}

}


/**

Output for q=2

Matrix m:
a b  
c d  

Matrix n:
b d  
a c 

**/




/**

Output for q=3 with char[][] m = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};

Matrix m:
a b c  
d e f  
g h i  

Matrix n:
c f i  
b e h  
a d g



**/
