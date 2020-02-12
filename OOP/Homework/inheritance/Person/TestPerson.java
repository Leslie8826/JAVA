public class TestPerson {

	public static void main(String[] args) {
		Person Jane = new Person("Jane", new Date (12, 4, 2006));

		Jane.write();
		System.out.print("\n Age: " + Jane.age());
	}
}

