public class MainClass {
	public static void main(String[] args) {
		AnimalScream[] screams = new AnimalScream[6];
		
		screams[0] = new Dog();
		screams[1] = new Cat();
		screams[2] = new Cat();
		screams[3] = new Rabbit();
		screams[4] = new Dog();
		screams[5] = new Cat();
		
		for (int i=0; i<6; i=i+1) {
			System.out.print("Animal " + i + " says: ");
			screams[i].scream();
		}
		
	}
}

