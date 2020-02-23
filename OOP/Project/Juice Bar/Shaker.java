/**
 * This class represents the blueprint of the shaker object 
 * */

public class Shaker {
	// static because all shakers will have the same capacity
	static int shakerCapacity = 700; // in millimeters
	Juice[] skakerContent;
	boolean clean;
	int totalJuice = 0;
	
	// Method to add the juice from the bottle to the shaker
	void add(Juice j, int quantity) {
		Bottle b = new Bottle(j);
		this.totalJuice = quantity + this.totalJuice;
	}
	
	// Method to empty the content of the shaker
	void empty() {
		this.totalJuice = 0;
	}
	
	// Method to clean the shaker object
	void clean() {
		System.out.println("Your shaker has been cleaned!!!");
	}
	
	// Method to get the quantity of juice in the shaker object
	int getJuiceQuantity() {
		return this.totalJuice;
	}
}

