// This program creates an ArrayList of grades. Then it diplays the grades stored (using a method).
// It computes the average of the grades (using a method) and adds grades (using a method)

import java.util.ArrayList;

public class arraylist {

	// method that computes the average of grades
	static void addGrade(ArrayList<Double> gradeList, Double grade) {
		gradeList.add(grade);
	}
	
	// method that displays the the grades stored in the ArrayList
	static void displayGrades(ArrayList<Double> gradeList) {
		for(int i=0; i<gradeList.size();i=i+1) {
			System.out.print(gradeList.get(i) + "\t");
		}
	}
	
	// method that computes the average of grades
	static double average(ArrayList<Double> gradeList) {
		double average = 0.0;
		double sum = 0.0;
		
		for(int i=0; i<gradeList.size();i=i+1) {
			sum = sum + gradeList.get(i);
		}
		
		average = sum/gradeList.size();
		
		return average;
	}
	
	public static void main(String[] args) {
		ArrayList gradeList = new ArrayList<Double>();
		
		// add grades to the list of grades
		addGrade(gradeList, 92.5);
		addGrade(gradeList, 97.75);
		addGrade(gradeList, 96.0);
		
		// displays the list of grades
		System.out.println("List of grades: ");
		displayGrades(gradeList);
		
		// computes the average of grades
		System.out.println("\n");
		System.out.println(" Average of grades: ");
		System.out.println(average(gradeList));
		
		// adds a new grade
		double grade = 96.25;
		System.out.println("\n Let's add a new grade: " + grade + " (out of 100)");
		addGrade(gradeList, grade);
		
		// displays the new list of grades
		System.out.println("\n New list of grades: ");
		displayGrades(gradeList);
		
		// computes the average of grades
		System.out.println("\n");
		System.out.println("New average of grades: ");
		System.out.println(average(gradeList));
	}
}


	
