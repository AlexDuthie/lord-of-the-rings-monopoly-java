package playerTests;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Player;

public class PlayerDebtTest2 {

	@Test
	public void test() {
		// testing the player debt when adding 100 to it's total
		
		Player player = new Player();
		
		player.set_player_debt(100);
		
		int output = player.get_player_debt();
		
		assertEquals(100, output);
	}

}
