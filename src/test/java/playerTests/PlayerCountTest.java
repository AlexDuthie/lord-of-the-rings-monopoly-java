package playerTests;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Game;

public class PlayerCountTest {

	@Test
	public void test() {
		Game game = new Game();
		
		game.setBoardPlayers(2);
		
		int output = game.getBoardPlayers();
		
		assertEquals(2, output);
	}

}
