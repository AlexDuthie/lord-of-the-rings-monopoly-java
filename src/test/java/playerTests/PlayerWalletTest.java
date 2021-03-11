package playerTests;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Player;

public class PlayerWalletTest {

	@Test
	public void test() {
		Player player = new Player();
		
		// Wallet is set to 1500 by default, passing through 100 should increment this to 1600
		player.setPlayerWallet(100);
		
		int output = player.getPlayerWallet();
		
		assertEquals(1600, output);
	}

}
