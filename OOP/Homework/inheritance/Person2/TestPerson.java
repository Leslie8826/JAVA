public class TestPerson {

	public static void main(String[] args) {
		Person Jane = new Person("Jane", new Date (12, 4, 2006));
		Jane.write(); // write() method from the Person class
		
		System.out.println("\n");
		Person2 Karl = new Person2("Karl", new Date(1, 1, 1998), "New York");
		Karl.write(); // write() method from the Person2 class
	}

}

