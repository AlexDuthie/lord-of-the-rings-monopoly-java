package playerTests;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Player;

public class PlayerDebtTest {

	@Test
	public void test() {
		Player player = new Player();
		
		for(int i = 0; i < 3; i++) {
			player.setPlayerDebt(100);
		}
	
		int output = player.getPlayerDebt();
		
		assertEquals(300, output);
	}

}
