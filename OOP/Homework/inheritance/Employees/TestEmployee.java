public class TestEmployee {

	public static void main(String[] args) {
		// Creates an array of 9 employees
		Employee[] managedEmployees = new Employee[9];
		
		// Creates 9 employees
		Employee employee1 = new Employee("Karl", 1, 7.22);
		Employee employee11 = new Employee("Kloe", 11, 6.82);
		Employee employee12 = new Employee("Arl", 12, 8.32);
		Employee employee13 = new Employee("Krol", 13, 9.33);
		Employee employee14 = new Employee("Klern", 14, 8.99);
		Employee employee15 = new Employee("Karl2", 15, 10.00);
		Employee employee16 = new Employee("Karl3", 16, 7.22);
		Employee employee17 = new Employee("Karl4", 17, 7.22);
		Employee employee18 = new Employee("Karl5", 18, 11.44);
		Employee employee19 = new Employee("Karl5", 19, 23.22);
		
		// Assigns the employees to the array
		managedEmployees[0] = employee11;
		managedEmployees[1] = employee12;
		managedEmployees[2] = employee13;
		managedEmployees[3] = employee14;
		managedEmployees[4] = employee15;
		managedEmployees[5] = employee16;
		managedEmployees[6] = employee17;
		managedEmployees[7] = employee18;
		managedEmployees[8] = employee19;
		
		// Displays the information of the first employee
		System.out.println("First employee information: ");
		System.out.println("Employee name: " + employee1.getName());
		System.out.println("Employee id: " + employee1.getId());
		System.out.println("Employee salary index: " + employee1.getSalIndex());
		System.out.println("Employee yearly salary: " + employee1.getSalary());
		
	
		//Displays the information of the manager with id=20
		Manager manager1 = new Manager("Trish", 20, 45.99);
		System.out.println("\n Manager information: ");
		System.out.println("Employee name: " + manager1.getName());
		System.out.println("Employee id: " + manager1.getId());
		System.out.println("Employee salary index: " + manager1.getSalIndex());
		System.out.println("Employee yearly salary: " + manager1.getSalary());
		
		
		// Displays the employees managed by manager of id=20
		manager1.managedEmployees(20);
	}

}
