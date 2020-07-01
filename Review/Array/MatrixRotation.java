

public class MatrixRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int q = 2;
		
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
