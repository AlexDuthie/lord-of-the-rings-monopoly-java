package main;
// Monopoly | Alex Duthie - 12010280

import java.util.Scanner;

import game.Dice;
import game.Player;

public class App {

	public static void main(String[] args) {
		
		start_game();
		
	}
	
	public static void start_game() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Would you like to start? (Yes or No)");
		String answer = input.nextLine().toLowerCase();
		
		if(answer.equals("yes")) {
			
			Dice dice = new Dice();
			Player p1 = new Player();
			
			do {
				
				System.out.println("\n-----------------------");
				System.out.println("Roll Dice? (Yes or No)");
				answer = input.nextLine().toLowerCase();
				
				if(answer.equals("yes")) {
					
					dice.roll_dice();
					p1.set_player_spaces(dice.get_dice_result());
					
					p1.set_player_location(p1.get_player_spaces());
					
					System.out.println("\nYou rolled: " + dice.get_dice_result());
					
					System.out.println("You landed on: " + p1.get_player_location());
					
					System.out.println("\nWallet: " + p1.get_player_wallet());
					
				}
				
			} while (p1.get_player_wallet() > p1.get_player_debt());
			
		} else {
			System.out.println("Ok, Bye!");
		}
		
		input.close();
		
	}
	
}
