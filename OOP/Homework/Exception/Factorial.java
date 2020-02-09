public class Factorial {
	static int factorial(int n){
		int res = 1; 
		
		if (n<0){
			throw new Not_defined(); 
		}
		
		for(int i = 1; i <= n; i++){ 
			res = res *i;
		}
		
		return res; 
	}
}
