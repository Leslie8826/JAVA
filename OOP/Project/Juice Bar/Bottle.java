/**
 * This class represents the blueprint of the Bottle object 
 * */

public class Bottle {
	Juice content = new Juice();
	Juice[] contentList = new Juice[2];
	int bottleCapacity=2000; // capacity in millimiters
	int quantity=bottleCapacity; // we assume that each bottle is full
	int checkQuantPoured;
	
	// Constructor with 1 parameter
	Bottle(Juice j){
		content = j;
	}
	
	Bottle(Juice j1, Juice j2){
		contentList[0] = j1;
		contentList[1] = j2;
	}
	
	// Method to pour juice from bottle
	int pour(int q) {
		quantity = quantity - q;
		checkQuantPoured = q;
		
		if(quantity > 0) {
			return quantity;
		} else {
			System.out.println("There is no " + content.getName() + " juice left");
			return 0;
		}
	}
	
	// Method to check the quantity poured from the bottle
	int checkQuantityPoured() {
		return this.checkQuantPoured;
		
	}
	
	// Method to get the quantity left in bottle
	int getQuantityBottle() {
		return quantity;
	}
	
	// Method to get the name/type of juice in the bottle
	String getName() {
		return content.getName();
	}
}

