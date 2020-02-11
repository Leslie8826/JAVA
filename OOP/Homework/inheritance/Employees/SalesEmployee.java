public class SalesEmployee extends Employee{
	double base = Employee.value;
	double salesResults;
	double salary_index;
	
	public SalesEmployees(String name, int id, double index) {
		super(name, id, index);
		this.salary_index = index;
	}
	
	public void setSalesResults(double sales) {
		salesResults = sales;
	}
	
	public double getSalesResults() {
		return this.salesResults;
	}
	
	double getSalary2() {
		double bonus = this.salesResults * 0.25;
		double salary = (base + bonus) * this.salary_index;
		return salary;
	}
	
	
}
