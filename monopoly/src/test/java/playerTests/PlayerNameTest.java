package playerTests;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Player;

public class PlayerNameTest {

	@Test
	public void test() {
		Player player = new Player();
		
		player.set_player_name("Alex");
		
		String output = player.get_player_name();
		
		assertEquals("Alex", output);
	}

}
