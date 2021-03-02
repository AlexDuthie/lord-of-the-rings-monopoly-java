package game;


import java.util.Random;

public class Dice {
	
	Random randomise = new Random();
	
	public int dice_1 = 0;
	public int dice_2 = 0;
	public int dice_result = 0;
	
	public void roll_dice() {
		do {
			dice_1 = randomise.nextInt(6);
			dice_2 = randomise.nextInt(6);
		} while(dice_1 == 0 || dice_2 == 0);
		
		dice_result = dice_1 + dice_2;
	}
	
	public int get_dice_result() {
		return dice_result;
	}
	
}
