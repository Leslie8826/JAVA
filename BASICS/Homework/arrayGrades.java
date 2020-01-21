/* This program asks a user to enter grades to be stored in an array.
   Then, the program finds the average of grades, the highest and lowest grades
   as well as the number of grades over 90.
*/

import java.util.Scanner;

public class arrayGrades {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of grades: ");
		int nb_grades = scan.nextInt();
		
		double[] grades = new double[nb_grades];
		
		Scanner scan2 = new Scanner(System.in);
		
		double sum = 0.0;
		
		int nb_grades_over_90 = 0;
		
		
		for (int i=0; i < grades.length; i++) {
			System.out.println("Enter the " + (i+1) + "th grade: ");
			grades[i] = scan2.nextDouble();
			sum = sum + grades[i];
			
			if (grades[i] > 90) {
				nb_grades_over_90 = nb_grades_over_90 + 1;
			}
		}
		
		double min = grades[0];
		double max = grades[0];
		
		for (int j=1; j<grades.length; j=j+1) {
			if (grades[j] < min) {
				min = grades[j];
			}
			if (grades[j] > max) {
				max = grades[j];
			}
		}
		
		System.out.println("Average of grades = " + sum/nb_grades);
		System.out.println("Highest grade = " + max);
		System.out.println("Lowest grade = " + min);
		System.out.println(" Number of grades over 90 = " + nb_grades_over_90);

	}

}
