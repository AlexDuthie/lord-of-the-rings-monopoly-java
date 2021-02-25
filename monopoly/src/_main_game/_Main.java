// Monopoly | Alex Duthie - 12010280

package _main_game;

import game_items.Board;
import game_items.Dice;

public class _Main {

	public static void main(String[] args) {
		
		Dice player1_dice = new Dice();
		Board player1_board = new Board();
		
		for(int i = 0; i < 3; i++) {
			
			System.out.println("Turn " + (i+1) + "\n");
			
			
			player1_dice.roll_dice();
			System.out.println("Dice 1: " 
								+ player1_dice.dice_1);
			System.out.println("Dice 2: " 
								+ player1_dice.dice_2);
			System.out.println("\nMove " 
								+ player1_dice.get_rolled_result()
								+ " Spaces\n");
			
			player1_board.set_player_location(player1_dice.get_rolled_result());
			
			System.out.println("You have landed on " + player1_board.get_board_location());
			System.out.println("\nTotal Spaces: " + player1_board.get_player_spaces() + "\n");
			
			System.out.println("\n-----------------------------\n");
		}
	}
}
