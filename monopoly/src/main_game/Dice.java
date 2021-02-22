package main_game;

import java.util.Random;

public class Dice {
	
	public static int roll_dice() {
		Random randomise = new Random();
		
		// there is two dice in monopoly
		int dice_1_sides = 6;
		int dice_2_sides = 6;
		
		// picks a random integer from the dice_1 and dice_2 values
		// adds the two values together
		int random_num = randomise.nextInt(dice_1_sides + dice_2_sides);
		
		// this should prevent a 0 being rolled
		if(random_num == 0) {
			random_num = randomise.nextInt(dice_1_sides + dice_2_sides);
		}
		
		// returning the result of the two dice being rolled
		return random_num;
	}
	
	
	// little function to fix the grammar of the rolled dice result
	// dice_num is passed through
	public static String fix_dice_grammar(int dice_num) {
		
		String result = "";
		
		if(dice_num == 8 || dice_num == 11) {
			result = "You have rolled an ";
		} else {
			result = "You have rolled a ";
		}
		
		return result;
	}
	
	// displays the result of the rolled dice to the player
	public static void go() {
		int dice_num = roll_dice();
		
		String fix_grammar = fix_dice_grammar(dice_num);
		
		System.out.println(fix_grammar + dice_num);
	}
}
