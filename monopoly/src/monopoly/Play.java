package monopoly;

import java.util.Random;

public class Play {
	
	public static int roll_dice() {
		Random randomise = new Random();
		
		// there is two dice in monopoly
		int dice_1_sides = 6;
		int dice_2_sides = 6;
		
		// picks a random integer from the dice_1 and dice_2 values
		// adds the two values together
		int random_num = randomise.nextInt(dice_1_sides + dice_2_sides);
		
		// returning the result of the two dice being rolled
		return random_num;
	}
}
