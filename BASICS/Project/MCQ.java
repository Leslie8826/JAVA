// This program aims to represent a multiple-choice questionnaire.
// First, the program asks the professor to enter the details about
// the mcq: number of questions, number of answers per questions (assuming 
// there will be the same number of questions for each question)
//
//

import java.util.Scanner;

public class MCQ
{
	public static void main(String[] args) 
	{
		// Asks the professor to type the numnber of questions of the Multiple Choice Questions 
		int number_questions=0, number_answers=0;
		System.out.println("Hello Professor, type the number of questions! ");
		Scanner scan_numb_questions = new Scanner(System.in);
		number_questions = scan_numb_questions.nextInt();
		
		// Asks the professor to type the numnber of answer of each questions
		System.out.println("Professor, type the number of answers for each question! ");
		Scanner scan_numb_answers = new Scanner(System.in);
		number_answers = scan_numb_questions.nextInt();
		
		String[] Question = new String[number_questions]; // stores the questions entered by the professor
		String[][] Answer = new String[number_questions][number_answers]; //Stores all multiple answers for each question entered by the professor
		int[] TheGoodChoice = new int[number_questions]; // stores the correct answers of the MCQ (student and prof)
		int[] numQuest = new int[number_questions]; //sert de numero de question avant la question posee // s
		int[] numAnswer = new int[number_answers]; // sert de numero de reponse avant la reponse du joueur
		int[] choice_mcq = new int[number_questions];  // reponse du joueur
		
		// Creates the MCQ
		QCM(Question, Answer, TheGoodChoice, numQuest, numAnswer, number_questions, number_answers);
	
		// Displays the questions of the MCQ
		System.out.println("\n Here is the MCQ: \n");
		MCQ_Display(numQuest, Question, Answer, numAnswer, number_questions, number_answers);
		
		System.out.println("\n Dear Professor, your questions and answers have been stored");
		
		// The student start answering the questions
		System.out.println("\n Beginning of the questionnaire: ");
		Questions_for_Student(numQuest, Question, numAnswer, Answer, choice_mcq, number_questions, number_answers);		
		
		// The student's results
		System.out.print("\n Results: ");
		Results(TheGoodChoice, choice_mcq, number_questions, number_answers); 
		System.out.print("/"+ number_questions);
		
		System.out.println("\n Do you want to start over the MCQ (y or n)?");
		Scanner scanStartOver = new Scanner(System.in);
		char continue_MCQ;
		continue_MCQ = scanStartOver.next().charAt(0);
		
		switch(continue_MCQ){
		case 'y':{
			char continue_MCQ_2='f';
			
			while(continue_MCQ_2 != 'n')
			{
				System.out.println("\n Hello Student, this is the Beginning of the questionnaire: ");
			
				Questions_for_Student(numQuest, Question, numAnswer, Answer, choice_mcq, number_questions, number_answers);		
			
				System.out.print("\n Results: ");
				Results(TheGoodChoice, choice_mcq, number_questions, number_answers); 
				System.out.print("/"+ number_questions);
				
				System.out.println(" \n Do you want to start over the MCQ (y or n)? ");
				Scanner scanStartOver_2 = new Scanner(System.in);
				continue_MCQ_2 = scanStartOver_2.next().charAt(0);
			}
			
			System.out.println(" You are done with the MCQ! ");
		}
		
		case 'n': 
			System.out.println(" The MCQ is over!! ");
		}
	}
	
	// Method to create the MCQ
	public static void QCM(String[] q, String[][] r, int[] goodChoice, int[] numQuest, int[] numRep, int number_questions, int number_answers)
	{
		Scanner scan = new Scanner(System.in);
		Scanner scanQuest = new Scanner(System.in);
		Scanner scanTheGoodChoice = new Scanner(System.in);
		
		// Array to store the question number (before content of question. 
		// Example--> 1. xxxx, 2. ddddd etc )
		for(int p=0; p<number_answers; p = p+1)
			numRep[p] = p+1;
		
		// Array to store questions along with answers
		for(int j=0; j<number_questions; j=j+1)
		{
			System.out.println("PROFESSOR, TYPE A QUESTION (or nothing if there is no question)");
			q[j] = scanQuest.nextLine();
			
			for(int j2=0; j2<number_answers; j2=j2+1)
			{
				System.out.println(numRep[j2] + ". Now Professor, type an answer (or nothing if there is no answer): ");
				r[j][j2] = scan.nextLine();
				
				if(j2 == number_answers-1)
				{
					System.out.println("FINALLY PROFESSOR, TYPE THE NUMBER OF THE RIGHT ANSWER: ");
					goodChoice[j] = scanTheGoodChoice.nextInt();
				}
			}
		}	
	}
	
	// Method to display the MCQ
	public static void MCQ_Display(int[] numQuest, String[] q, String[][] r, int[] numAns, int number_questions, int number_answers)
	{
		for(int p=0; p<number_answers; p = p+1)
			numAns[p] = p+1;
		
		for(int p=0; p<number_questions; p = p+1)
			numQuest[p] = p+1;
		
		for(int j=0; j<number_questions; j=j+1)
		{
			System.out.println("Question " + numQuest[j] + ": " + q[j]);
			
			for(int j2=0; j2<number_answers; j2=j2+1)
			{
				System.out.println( "    " + numAns[j2] + ". " + r[j][j2]);
			}
		}
	}
	
	// Method to store the answers (Student)
	public static void studentChoice(int i, int[] choice_mcq, int number_answers)
	{		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n Student, type your answer number: ");
		choice_mcq[i] = scan.nextInt();
		
		if(choice_mcq[i] < 1 || choice_mcq[i] > number_answers)
		{
			System.out.println("SORRY STUDENT!! THIS ANSWER DOES NOT EXIST. PLEASE TRY AGAIN AND TYPE A VALID NUMBER: ");
			choice_mcq[i] = scan.nextInt();
		}
	}
		
	public static void Questions_for_Student(int[] numQuest, String [] q, int[] numRep, String[][] r, int[] choice_mcq, int number_questions, int number_answers)
	{
		for(int p=0; p<number_answers; p = p+1)
			numRep[p] = p+1;
		
		for(int p=0; p<number_questions; p = p+1)
			numQuest[p] = p+1;
		
		for(int j=0; j<number_questions; j=j+1)
		{
			System.out.println( " Question "+ numQuest[j] + ": " + q[j]);
			
			for(int j2=0; j2<number_answers; j2=j2+1)
			{
				System.out.println("    " + numRep[j2] + ". " + r[j][j2]);
			}
			
			studentChoice(j, choice_mcq, number_answers);
		}
	}
	
	// Method to compute and display the student final results
	public static void Results(int[] goodChoice, int[] choix_qcm, int number_questions, int number_answers)
	{
		double count_grade=0;
		int value_of_choice_mcq=0;
		int value_of_goodChoice=0;
		
		for(int i=0; i<number_questions; i=i+1)
		{
			value_of_choice_mcq = choix_qcm[i];
			value_of_goodChoice = goodChoice[i];
				
			if(value_of_goodChoice == value_of_choice_mcq)
				count_grade = count_grade + 1;	
		}
		
		if((count_grade/number_questions) >= 0.5)
			System.out.println("\n Congratulations! You passed the exam!! ");
		else
			System.out.println("\n Sorry! You failed the exam!! ");
		
		System.out.println(count_grade);
	}
}
