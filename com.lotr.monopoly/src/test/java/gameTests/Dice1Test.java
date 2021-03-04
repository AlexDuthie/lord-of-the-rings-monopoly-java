package gameTests;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Dice;

public class Dice1Test {

	@Test
	public void test() {
		Dice dice = new Dice();
		
		for(int i = 0; i < 10000; i++) {
			dice.rollDice1();
			
			int output = dice.getRolledDice1();
				
			assertTrue(output > 0 && output < 7);
		}
	}
}
