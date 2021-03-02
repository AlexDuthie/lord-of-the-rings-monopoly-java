package playerTests;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Player;

public class PlayerTokenTest {

	@Test
	public void test() {
		// see tokens array below (13-25
		/*
		  		String[] tokens = {
				"Battleship", 
				"Boot", 
				"Cannon",
				"Horse",
				"Rider",
				"Iron", 
				"Racecar", 
				"Dog", 
				"Thimble", 
				"Top Hat",
				"Wheelbarrow"
				};
		 */
	
		Player player = new Player();
		
		// player token will be position 0 in the tokens array
		player.set_player_token(0);
		
		String output = player.get_player_token();
	
		assertEquals("Battleship", output);
	}

}
