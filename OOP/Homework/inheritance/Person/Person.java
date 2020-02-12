public class Person {
	Date birthdate; 
	String name;
	
	public Person(String name, Date birth) { 
		this. name = name;
		this.birthdate = birth;
	}
	
	public void write() { 
		System.out.print(name + "'s DOB (d/m/y) = "); 
		birthdate.write(); 
	}
}
