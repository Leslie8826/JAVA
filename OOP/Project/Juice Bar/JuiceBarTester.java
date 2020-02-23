public class JuiceBarTester {
	
	public static void main(String[] args) {
		Juice apple = new Juice();
		Juice pineapple = new Juice();
		Juice orange = new Juice();
		apple.setName("Apple");
		pineapple.setName("Pineapple");
		orange.setName("Orange");
		Shaker shaker = new Shaker();
		
		Bottle b1 = new Bottle(apple);
		Bottle b2 = new Bottle(pineapple);
		Bottle b3 = new Bottle(orange);
		
		Glass myGlass = new Glass();
		myGlass.glassCapacity = 600;
		
		System.out.println("My juice bar: ");
		System.out.println("Bottle of " + b1.getName() + " juice: " + b1.getQuantityBottle() + " ml");
		System.out.println("Bottle of " + b2.getName() + " juice: " + b2.getQuantityBottle() + " ml");
		System.out.println("Bottle of " + b3.getName() + " juice: " + b3.getQuantityBottle() + " ml");
		
		// Apple juice
		// Transfer from bottle to shaker
		b1.pour(150);
		System.out.println("\n Pouring " + b1.checkQuantityPoured() + " ml of " + b1.getName() + " juice: ");
		System.out.print("Quantity in shacker: ");
		shaker.add(b1.content, b1.checkQuantityPoured());
		System.out.print(shaker.getJuiceQuantity());
		System.out.println(" ml");
		System.out.println("Quantity left in bottle = " + b1.getQuantityBottle() + " ml");
		
		// Pineapple juice
		// Transfer from bottle to shaker
		b2.pour(150);
		System.out.println("\n Pouring " + b2.checkQuantityPoured() + " ml of " + b2.getName() + " juice: ");
		System.out.print("Quantity in shacker: ");
		shaker.add(b2.content, b2.checkQuantityPoured());
		System.out.print(shaker.getJuiceQuantity());
		System.out.println(" ml");
		System.out.println("Quantity left in bottle = " + b2.getQuantityBottle() + " ml");
		
		// Orange juice
		// Transfer from bottle to shaker
		b3.pour(320);
		System.out.println("\n Pouring " + b3.checkQuantityPoured() + " ml of " + b3.getName() + " juice: ");
		System.out.print("Quantity in shacker: ");
		shaker.add(b3.content, b3.checkQuantityPoured());
		System.out.print(shaker.getJuiceQuantity());
		System.out.println(" ml");
		System.out.println("Quantity left in bottle = " + b3.getQuantityBottle() + " ml");
		
	
		// Transfer from shaker to glass
		System.out.println("\n");
		myGlass.add(shaker, shaker.getJuiceQuantity());
		myGlass.getGlassContent();
		
		System.out.println("\n Let's drink!");
		myGlass.drink(50);
		
		System.out.println("\n No waste please! Finish your glass!!!");
		
		System.out.println("\n Let's keep drinking!");
		myGlass.drink(200);
		myGlass.drink(350);
		
		System.out.println("\n Let's clean the shaker and the glass:");
		System.out.println("First, let's see if there are remaining liquids in both: ");
	    shaker.empty();
	    System.out.println("Content in shaker now: " + shaker.getJuiceQuantity());
	    System.out.println("Content in glass now: " + myGlass.empty());
	    shaker.clean();
	    myGlass.clean();
		
	}

}

