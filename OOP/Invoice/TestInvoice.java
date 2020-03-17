
public class testInvoice {

	public static void main(String[] args) {
		Invoice article1 = new Invoice("article 1", "soap", 4, 4.99);
		Invoice article2 = new Invoice("article 2", "bananas", 8, 1.29);
		Invoice article3 = new Invoice("article 3", "brown rice box", 2, 5.35);
		Invoice article4 = new Invoice("article 4", "bottle of water", 12, 3.79);
		
		System.out.println("Number: " + article1.getNumber());
		System.out.println("Description: " + article1.getDescription());
		System.out.println("Price: " + article1.getPrice());
		System.out.println("Quantity: " + article1.getQuantity());
		System.out.println("Total: " + article1.getInvoice());
		
		
		System.out.println("\n ");
		System.out.println("Number: " + article2.getNumber());
		System.out.println("Description: " + article2.getDescription());
		System.out.println("Price: " + article2.getPrice());
		System.out.println("Quantity: " + article2.getQuantity());
		System.out.println("Total: " + article2.getInvoice());
		
		
		System.out.println("\n ");
		System.out.println("Number: " + article3.getNumber());
		System.out.println("Description: " + article3.getDescription());
		System.out.println("Price: " + article3.getPrice());
		System.out.println("Quantity: " + article3.getQuantity());
		System.out.println("Total: " + article3.getInvoice());
		
		
		System.out.println("\n ");
		System.out.println("Number: " + article4.getNumber());
		System.out.println("Description: " + article4.getDescription());
		System.out.println("Price: " + article4.getPrice());
		System.out.println("Quantity: " + article4.getQuantity());
		System.out.println("Total: " + article4.getInvoice());
		
		System.out.println("\n Total:");
		double total = article1.getInvoice()+ article2.getInvoice() + article3.getInvoice() + article4.getInvoice();
		System.out.println(total);

	}

}

