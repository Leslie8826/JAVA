import java.util.Scanner;

public class surveyFunction {
	
	// Function computes the total number of women
	static int nb_women(int[][] a) {
		int res = 0;
		
		for (int k=0; k< a[1].length; k++) {
			res = res + a[1][k];
			}
	
		return res;
	}
	
	// Function computes the number of voters per category (yes, no, abstention)
	static int nb_per_category(int[][] a, int index) {
		switch(index) {
		case 0:
			return a[0][0] + a[1][0];
		case 1:
			return a[0][1] + a[1][1];
		case 2:
			return a[0][2] + a[1][2];
			
		}
		
		return index;
	}

	// Function that predicts the results of the vote
	// prints yes when there is a tie because initial value of 
	// result is 0 (index of Yes vote)
	// I have to find a way to get rid of printing the yes in the case
	// of a tie
	static int resultVotes(int[][] a) {
		int result = 0;
		
		int yes = a[0][0] + a[1][0];
		int no = a[0][1] + a[1][1];
		
		if (yes > no) {
			result = 0;
		} else if (yes < no){
			result = 1;
		} else {
			System.out.println("There is a tie");
		}
	
		return result;
	}
	
	// Function finds out if women and men are equal in numbers
		static boolean genderEquitable(int[][] a) {
			int nb_women = 0;
			int nb_men = 0;
			
			for (int k=0; k<3; k++) {
				nb_men = nb_men + a[0][k];
				nb_women = nb_women + a[1][k];
				}
			
			return nb_women == nb_men;
		}
		
		// Function computes statistics on gender equality
				static double gender_stats(int[][] a) {
					double nb_women = 0;
					double nb_men = 0;
					double ratio = 0;
					
					for (int k=0; k<3; k++) {
						nb_men = nb_men + a[0][k];
						nb_women = nb_women + a[1][k];
						} 
					
					ratio = nb_women/nb_men;
					
					return ratio;
				}
		

	public static void main(String[] args) {
		int[][] survey = new int[2][3];
		
		String[] gender = {"man", "woman"};
		
		String[] vote = {"yes", "no", "abstention"};
		
		System.out.println("\n This is how to read the survey: ");
		System.out.println("Legend for the rows: ");
		for(int i=0; i<2; i++) {
			System.out.print(i + " " + gender[i]);
			System.out.print("\n");
		}
		
		System.out.println("\n Legend for the columns: ");
		for(int i=0; i<3; i++) {
			System.out.print(i + " " + vote[i]);
			System.out.print("\n");
		}
		
		Scanner scan = new Scanner(System.in);
		
		for (int p=0; p<2; p=p+1) {
			for (int s=0; s<3; s++) {
				System.out.println("\n Enter the number of " + vote[s] + " for " + gender[p]);
				survey[p][s] = scan.nextInt();
			}
		}
		
		for (int p=0; p<2; p=p+1) {
			System.out.print(gender[p]);
			for (int s=0; s<3; s++) {
				System.out.print(" " + survey[p][s]);
			}
			System.out.print("\n");
		}
		
		System.out.println("\n Number of women = " + nb_women(survey));
		System.out.println("\n Number of voters = " + nb_per_category(survey, 0)+ " (for " + vote[0] + ")");
		System.out.println("\n Number of voters = " + nb_per_category(survey, 1)+ " (for " + vote[1] + ")");
		System.out.println("\n Number of voters = " + nb_per_category(survey, 2)+ " (for " + vote[2] + ")");
		
		System.out.println(vote[resultVotes(survey)]);
	
		System.out.print("\n Are there as many women as there are men? " + genderEquitable(survey));
		
		if (gender_stats(survey) > 1) {
			System.out.println("\n There are " + gender_stats(survey) + " time(s) more women than there are men");
		} else if(gender_stats(survey) < 1) {
			System.out.println("\n There are " + gender_stats(survey) + " time(s) less women than there are men");
		} else {
			System.out.println("\n There are as many women yhan there are men");
		}
	}

}

