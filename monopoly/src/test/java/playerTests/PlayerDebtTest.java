package playerTests;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Player;

public class PlayerDebtTest {

	@Test
	public void test() {
		// testing the default debt which is set to 0 by default
		
		Player player = new Player();
		
		int output = player.get_player_debt();
		
		assertEquals(0, output);
	}

}
