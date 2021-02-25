package game_items;

import java.util.Random;

public class Dice {
	
	Random randomise = new Random();
	
	// Dice Variables
	int dice_sides = 6;
	public int dice_1 = 0;
	public int dice_2 = 0;
	public int result = 0;
	
	public int roll_dice() {
		do {
			dice_1 = randomise.nextInt(dice_sides);
			dice_2 = randomise.nextInt(dice_sides);
		} while(dice_1 == 0 || dice_2 == 0);
		
		result = dice_1 + dice_2;
		
		return result;
	}
	
}
