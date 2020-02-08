import java.util.ArrayList;

public class library {
	ArrayList<book> library = new ArrayList<book>();
	
	// Method to add books in library
	ArrayList<book> addBook(book book) {
		library.add(book);
		return library;
	}
	
	// Method to display all books in library
	void displayLibrary(){
		for (int i=0; i<library.size(); i++) {
			System.out.println(library.get(i).getTitle());
		}
	}
	
}
