package playerTests;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Player;

public class PlayerLocationTest {

	@Test
	public void test() {
		// board_locations can be seen below (15-21)
		/*
		 	public String[] board_locations = {
			"Start",
			"The Shire",
			"Farmer Maggot's Crops",
			...
			...
			};
		 */
		
		Player player = new Player();
		
		// passing 2 spaces on the board through the parameters
		// this would usually be done using a dice object
		// the location should be the 2nd location in the board_locations array (Farmer Maggot's Crops)
		player.setPlayerLocation(2);
		
		String output = player.getPlayerLocation();
		
		// tested manually several times
		assertEquals("Farmer Maggot's Crops", output);
	}

}
