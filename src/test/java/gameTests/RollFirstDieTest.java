package gameTests;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Dice;

public class RollFirstDieTest {

	@Test
	public void test() {
		Dice dice = new Dice();
		int output = 0;
		
		for(int i = 0; i < 10000; i++) {
			dice.rollFirstDice();
			output = dice.getFirstDiceNum();	
		
			assertTrue(output <= 6 && output >= 1);
		}
	}

}
