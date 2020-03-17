public class Invoice {
	private String number;
	private String description;
	private int quantity;
	private double price;
	
	public Invoice(String number, String description, int quantity, double price){
		this.number = number;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		}
	
	// Get & set for number
	public String getNumber() {
		return this.number;
	}
	
	public void setNumber(String numb) {
		this.number = numb;
	}
	
	// Get & set for description
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String descr) {
		this.description = descr;
	}
	
	// Get & set for quantity
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setQuantity(int quant) {
		this.quantity = quant;
	}
	
	// Get & set for price
		public double getPrice() {
			return this.price;
		}
		
		public void setPrice(double p) {
			this.price = p;
		}
		
	// Method to calculate the invoice amount
		public double getInvoice() {
			double sum = 0.0;
			if(this.quantity <= 0 || this.price <= 0) {
				sum = 0.0;
			} else if (this.quantity > 0 && this.price > 0){
				sum = this.price * this.quantity;
			}
			return sum;
		}
}

