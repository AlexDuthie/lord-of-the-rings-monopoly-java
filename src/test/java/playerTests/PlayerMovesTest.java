package playerTests;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Player;

public class PlayerMovesTest {

	@Test
	public void test() {
		Player player = new Player();
		
		for(int i = 0; i < 11; i++) {
			//1+2+3+4+5+6+7+8+9+10
			player.setPlayerMoves(i);
		}
		
		int output = player.getPlayerMoves();
		
		assertEquals(55, output);
	}

}
