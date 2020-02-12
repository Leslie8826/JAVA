public class Date {
	int day;
	int month;
	int year;
	static int CURRENT_YEAR = 2020;
	
	public Date (int d, int m, int y){ 
		this.day = d;
		this.month = m;
		this.year = y; 
	}
	
	public void write() { 
		System.out.print(this.day + "/" + this.month + "/" + this.year);
	   } 
}

