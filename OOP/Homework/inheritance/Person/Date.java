public class Date {
	int day;
	int month;
	int year;
	static int CURRENT_YEAR = 2020;
	
  // Constructor to set day, month and year
	public Date (int d, int m, int y){ 
		this.day = d;
		this.month = m;
		this.year = y; 
	}
	
	public void write() { 
		System.out.print(this.day + "/" + this.month + "/" + this.year);
	   } 
	
}

