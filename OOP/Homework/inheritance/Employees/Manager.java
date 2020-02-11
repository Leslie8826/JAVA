public class Manager extends Employee {
	Employee employee11 = new Employee("Kloe", 11, 6.82);
	Employee employee12 = new Employee("Arl", 12, 8.32);
	Employee employee13 = new Employee("Krol", 13, 9.33);
	Employee employee14 = new Employee("Klern", 14, 8.99);
	Employee employee15 = new Employee("Karl2", 15, 10.00);
	Employee employee16 = new Employee("Karl3", 16, 7.22);
	Employee employee17 = new Employee("Karl4", 17, 7.22);
	Employee employee18 = new Employee("Karl5", 18, 11.44);
	Employee employee19 = new Employee("Karl5", 19, 23.22);
	
	Employee[] managedEmployees = {employee11, employee12, employee13, employee14, employee15, employee16, employee17,
			employee18, employee19};
	
	int[] managedEmployeesId = {0, 0, 0, 0, 0, 0, 0, 0, 0};
	
	// Constructor for manager. It inherites the functionalities of the constructor of the employee class
	public Manager(String name, int id, double index) {
		super(name, id, index);	
	}
	
	int count=0;
	public void managedEmployees(int managerId){
		if(this.id%10 == 0) {
			
			// Stores the ids of managed employees in an array
			for(int i = managerId - managedEmployees.length; i < managerId; i++) {
				managedEmployeesId[count] = managedEmployees[count].getId();
				count = count + 1;
			}	 
		}
		
		// Displays the ids of employees managed by manager of id managerId
			for(int i = 0; i < 9; i++) {
				System.out.println(managedEmployees[i].getId());
			}
		}
}
