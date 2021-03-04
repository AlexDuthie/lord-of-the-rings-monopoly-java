
package playerTests;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Player;

public class PlayerSpacesMovedTest {

	@Test
	public void test() {
		// testing to see how many spaces a player has moved in total
		
		Player player = new Player();
		
		// loops 5 into player spaces 3 times to simulate a dice being thrown 3 times
		for(int i = 0; i < 3; i++) {
			player.setPlayerSpaces(5);
		}
		
		int output = player.getPlayerSpaces();
		
		// the spaces should be 15 due to 5 being iterated 3 times
		assertEquals(15, output);
	}
}
