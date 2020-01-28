// This program serves as an arbitrator in a Nim Game
// Rules of the game: 
// n number of matches
// + 2 players against each other
// + each player has to remove a certain number of matches from the total: 1, 2 or 3 match(es)
// + each player cannot remove the same number of matches the other player just removed:
//          example --> player1 removes 2 matches, then player2 can only remove 1 or 3 matches
// The player who cannot remove any matches lose the game. This happens when there are zero matches left
// or when only one match remains and the previous player took one match

// This a draft of the game. It works for a few cases not all of them
// Needs improvement

import java.util.Scanner;

public class jeuDeNim_V3 {

	public static void main(String[] args) {
		int total_matches = 0;
		int remaining_matches = 0;
		int current_player = 1;
		
		int move1 = 1;
		int move2 = 2;
		int move3 = 3;
		
		int player1_move, player2_move = 0;
		
		Scanner input_player1 = new Scanner(System.in);
		Scanner input_player2 = new Scanner(System.in);
		
		System.out.println("\n TEST Player , choose number of matches: ");
		player1_move = input_player1.nextInt();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the total number of matches: ");
		total_matches = scan.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		
		int player = 1;
		
		while (total_matches >= 0) {
			if(total_matches == 0) {
				System.out.println("Player " + (player+1) + " wins");
				break;// stops while loop if there is a winner
			} 
			
			if (total_matches == 1) {
				System.out.println("Player " + (player+1) + " wins");
				break;// stops while loop is there is a winner
			}
			switch(player) {
			case 1:
				System.out.println("\n Player " + player + ", choose number of matches: ");
				player1_move = input_player1.nextInt();
				int t=player1_move;
				
				if (player1_move == player2_move) {
					while (player1_move == player2_move) {
					System.out.println("\n Player " + player + ", choose number of matches other than " + player2_move);
					player1_move = input_player1.nextInt();
					}
				}
				
				total_matches = total_matches - player1_move;
				System.out.println("Remaining matches: " + total_matches);
				
				if (player == 1) {
					player = player + 1;
				} else if(player == 2) {
					player = player - 1;
				}
			
			case 2:	
				System.out.println("\n Player " + player + ", choose number of matches: ");
				player2_move = input_player2.nextInt();
				
				if (player2_move == player1_move) {
					while (player2_move == player1_move) {
						System.out.println("\n Player " + player + ", choose number of matches other than " + player1_move);
						player2_move = input_player2.nextInt();
					}
				}
				
				total_matches = total_matches - player2_move;
				
				System.out.println("Remaining matches: " + total_matches);
				
				if (player == 1) {
					player = player + 1;
				} else if(player == 2) {
					player = player - 1;
				}
				
			}
			
			
		}
	}	

}

