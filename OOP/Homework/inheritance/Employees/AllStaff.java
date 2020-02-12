// This class represents all the staff of this company
// A method is also created to compute the sum of 
// all salaries

public class AllStaff {
  
	Employee[] List_of_employees = new Employee[20];
	int nbEmployees = 0;
	Manager[] List_of_managers = new Manager[2];
	int nbManagers = 0;
	
	Employee employeeSearch(int id) {
		for (int i=0; i<nbEmployees; i++) {
			if (List_of_employees[i].id == id) {
				return List_of_employees[i];
			}
		}
		return null;
	}
	
	// employee object is added to an array of employees only if their id is mull
	void addEmployee(Employee e) {
		if(employeeSearch(e.id) == null) {
			List_of_employees[nbEmployees] = e;
			nbEmployees++;
		}
	}
	
	// manager object is added to an array of managers and an array of employees only if their id is null
	void addManager(Manager m) {
		if (employeeSearch(m.id) == null) {
			addEmployee(m);
			List_of_managers[nbManagers] = m;
			nbManagers++;
		}
	}
	
	void displayAllStaff_by_name() {
		for (int i=0; i<nbEmployees; i++) {
			System.out.print(List_of_employees[i].getName());
			System.out.print("\n");
		}
	}
	
	void displayAllStaff_by_id() {
		for (int i=0; i<nbEmployees; i++) {
			System.out.print(List_of_employees[i].getId());
			System.out.print("\n");
		}
	}
	
	
	double sumSalaries() {
		double sum = 0;
		
		for(int i=0; i < nbEmployees; i++) {
			sum = sum + List_of_employees[i].getSalary();
		}
		return sum;
	}
}

