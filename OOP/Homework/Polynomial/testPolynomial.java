public class testPolynomial {

	public static void main(String[] args) {
		polynomial p = new polynomial();
		
		// We set the coefficients of the polynomial
		p.setZero(2);
		p.setOne(-5);
		p.setTwo(3);
		p.setThree(5);
		
		// We display the polynomial
		System.out.println("Here is the polynomial:");
		p.display();
		
		System.out.println("\n");
		
		// We compute the polynomial for a given value of x
		System.out.println("The result for x = " + p.x + ": ");
		System.out.println(p.add());
	}

}

