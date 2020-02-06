public class polynomial {
	int x=2;
	
	int n0; int n1; int n2; int n3;
	
	int pol;
	
	int setZero(int i) {
		return n0 = i;
	}
	
	int setOne(int i) {
		return n1 = i;
	}
	
	int setTwo(int i) {
		return n2 = i;
	}
	
	int setThree(int i) {
		return n3 = i;
	}

	void display() {
		System.out.println("(" + n3 + ")x*x*x + " + "(" + n2 + ")x*x + (" + n1  + ")x + (" + n0 + ")");
	}
	
	int add() {
		pol = n0 + n1*x + n2*x*x + n3*x*x*x;
		return pol;
	}
}

