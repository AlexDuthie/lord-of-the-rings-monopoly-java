package playerTests;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Player;

public class PlayerWalletTest {

	@Test
	public void test() {
		Player player = new Player();
		
		// default wallet is 1500, passing 100 through should increment this to 1600
		player.set_player_wallet(100);
		
		int output = player.get_player_wallet();
		
		assertEquals(1600, output);
	}

}
