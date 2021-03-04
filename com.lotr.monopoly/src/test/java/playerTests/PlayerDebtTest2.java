package playerTests;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Player;

public class PlayerDebtTest2 {

	@Test
	public void test() {
		// testing the player debt when adding 100 to it's total
		
		Player player = new Player();
		
		player.setPlayerDebt(100);
		
		int output = player.getPlayerDebt();
		
		assertEquals(100, output);
	}

}
