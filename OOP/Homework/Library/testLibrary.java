public class tesLibrary {
	public static void main(String[] args) {
		book b1 = new book();
		book b2 = new book();
		library l = new library();
		
		
		// Book 1
		b1.setTitle("Introduction to Robotics");
		b1.setAuthor("Colin D. Simpson");
		b1.setEditor("Ray Santers Edition");
		
		/*System.out.println("First book: ");
		System.out.println("Title --> " + b1.getTitle());
		System.out.println("Author --> " + b1.getAuthor());
		System.out.println("Editor --> " + b1.getEditor());*/
		
		// Book 2
		b2.setTitle("Handbook of Robotics");
		b2.setAuthor("Bruno Siciliano");
		b2.setEditor("Springer Edition");
		
		/*System.out.println("\n Second book: ");
		System.out.println("Title --> " + b2.getTitle());
		System.out.println("Author --> " + b2.getAuthor());
		System.out.println("Editor --> " + b2.getEditor());*/
		
		
		// Add books b1 and b2 in the library
		l.addBook(b1);
		l.addBook(b2);
		
		// Displays the books b1 and b2 in library
		System.out.println("\n Books in library:");
		l.displayLibrary();
		
	}
}

