public class Employee {
	String employeeName;
	int id;
	double salary_index;
	//static double salary = 150000;
	static double value = 150000;
	
	
	// Constructor to set the name, the id and the salary index of an employee
	public Employee(String name, int id, double index) {
		this.employeeName = name;
		this.id = id;
		this.salary_index = index;
	}
	
	// Method to get the name of an employee
	public String getName() {
		return this.employeeName;
	}
	
	// Method to get the id of an employee
	public int getId() {
		return this.id;
	}
	
	// Method to get the salary index of an employee
	public double getSalIndex() {
		return this.salary_index;
	}
	
	// Method to get the yearly salary of an employee
	double getSalary() {
		double salary = salary_index * value;
		//return this.salary_index * value;
		return salary;
	}
}
