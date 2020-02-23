/**
 * This class represents the blueprint of the glass object 
 * */

public class Glass {
	int glassCapacity;
	Shaker s;
	int var;
	
	// Method to add what is in the shaker into the glass object
	void add(Shaker sh, int quantity) {
		if(glassCapacity >= sh.getJuiceQuantity()) {
			this.glassCapacity = sh.getJuiceQuantity();
			var = sh.getJuiceQuantity();
			var = sh.getJuiceQuantity() - this.glassCapacity;
			System.out.println(this.glassCapacity + " ml was added to your glass");
			System.out.println("Quantity left in shaker: " + var + " ml");
		} else {
			this.glassCapacity = this.glassCapacity;
			var = sh.getJuiceQuantity();
			var = sh.getJuiceQuantity() - this.glassCapacity;
			System.out.println("Only " + this.glassCapacity + " ml was added to your glass");
			System.out.println("Quantity left in shaker: " + var + " ml");
		}
	}
	
	 void drink(int q) {
		if (q <= this.glassCapacity) {
			this.glassCapacity = this.glassCapacity - q;
			System.out.println("You drank " + q + " ml");
			System.out.println("Quantity left in your glass: " + this.glassCapacity + " ml");
		} else {
			System.out.println("You can only drink " + this.glassCapacity + " ml");
		}
	}
	
	void getGlassContent() {
		if(glassCapacity >= s.shakerCapacity) {
			System.out.println(this.glassCapacity);
		}	
	}
	
	int empty() {
		var = 0;
		return var;
	}
	
	void clean() {
		System.out.println("Your glass has been cleaned!!!");
	}
}

