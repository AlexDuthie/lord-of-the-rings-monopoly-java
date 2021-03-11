package gameTests;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Dice;

public class RollSecondDieTest {

	@Test
	public void test() {
		Dice dice = new Dice();
		int output = 0;
		
		for(int i = 0; i < 10; i++) {
			dice.rollSecondDice();
			output = dice.getSecondDiceNum();	
		
			assertTrue(output <= 6 && output >= 1);
		}
	}

}
