public class Person2 extends Person {
	String birthdate_place;
	
	public Person2(String name, Date birth, String place) {
		super(name, birth);
		this.birthdate_place = place;
	}
	
	public void write() { 
		super.write(); //inhetrits properties from the write() method in Person class 
		System.out.print(" in " + this.birthdate_place);
	}	
}

