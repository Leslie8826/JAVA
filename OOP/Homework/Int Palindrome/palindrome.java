public class palindrome {
	int count = 0;
	int nb;
	boolean bool = false;
	
	palindrome(int x){
		this.nb = x;
	}
	
	public boolean isPalindrome(int x){
		String str = String.valueOf(x);
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == str.charAt(str.length()-1-i)) {
				count = count + 1;
				} 
			}	
		
		if(count == str.length()) {
			bool = true;
		} else {
			bool = false;
		}
		return bool;
	}
}

