package gameTests;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Dice;

public class DiceTest {

	@Test
	public void test() {
		Dice dice = new Dice();
		
		// method that rolls dice 1 and dice 2
		dice.roll_dice();
		
		// gets dice 1's result
		int output1 = dice.getRolledDice1();
		// gets dice 2's result
		int output2 = dice.getRolledDice2();
		
		// combines dice 1 and dice 2 in a new declaration
		int output = output1 + output2;
		
		// combines the output of dice 1 and dice 2 to the getter "get_dice_result"
		assertEquals(output, dice.getDiceResult());
	}

}
