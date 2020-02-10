public class TestEmployee {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Karl", 1, 7.22);
		
		System.out.println("First employee information: ");
		System.out.println("Employee name: " + employee1.getName());
		System.out.println("Employee id: " + employee1.getId());
		System.out.println("Employee salary index: " + employee1.getSalIndex());
		System.out.println("Employee yearly salary: " + employee1.getSalary());
		
	}

}

