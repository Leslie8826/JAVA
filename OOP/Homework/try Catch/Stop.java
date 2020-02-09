
public class Stop {
	
	static int l(int x) {
		
		if (x < 0) {
			throw new Stop2();
		}
		
		return x; 
	}
	
	public static void main(String[] args) {
		int y = 0;
		
		try {
			System.out.println("Hello 1"); 
			y = l(-2);
			// y = l(2);
			
			System.out.println("Hello 2");
			} catch (Stop2 e) { 
				System.out.println("Hello 3");
			}
		
		System.out.println("\n y = " + y); 
		
	}
}

