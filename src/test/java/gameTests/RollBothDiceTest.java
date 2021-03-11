package gameTests;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Dice;

public class RollBothDiceTest {

	@Test
	public void test() {
		Dice dice = new Dice();
		
		for(int i = 0; i < 10000; i++) {
			dice.rollDice();
			
			int output = dice.getDiceResult();
			
			assertTrue(output <= 12 && output >= 1);
		}
	}

}
