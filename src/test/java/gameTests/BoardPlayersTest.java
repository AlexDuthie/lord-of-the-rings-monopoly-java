package gameTests;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Game;

public class BoardPlayersTest {

	@Test
	public void test() {
		Game board = new Game();
		
		board.setBoardPlayers(4);
		
		assertEquals(4, board.getBoardPlayers());
	}

}
