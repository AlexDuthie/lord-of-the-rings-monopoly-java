// Monopoly | Alex Duthie - 12010280

package _main_game;

import game_items.Board;
import game_items.Dice;

public class _Main {

	public static void main(String[] args) {
		
		Dice player1_dice = new Dice();
		Board player1_board = new Board();
		
		player1_dice.roll_dice();
		System.out.println("Dice 1: " 
							+ player1_dice.dice_1);
		System.out.println("Dice 2: " 
							+ player1_dice.dice_2);
		System.out.println("\nResult: " 
							+ player1_dice.result);
		
		if(player1_dice.result <= player1_board.board_locations.length) {
			player1_board.set_player_position(player1_dice.result);
			
			System.out.println("\nYou landed on " + player1_board.get_board_location());
		} else {
			player1_board.set_player_position(player1_dice.result
												- player1_board.board_locations.length);
			System.out.println("\nFull Circle!");
			System.out.println("You landed on " + player1_board.get_board_location());
		}
		
	}
}
