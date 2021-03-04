package playerTests;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Player;

public class PlayerNameTest {

	@Test
	public void test() {
		Player player = new Player();
		
		player.setPlayerName("Alex");
		String output = player.getPlayerName();
		
		assertEquals("Alex", output);
	}

}
