package playerTests;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Player;

public class PlayerLocationTest2 {

	@Test
	public void test() {
		// board locations
		/*
		  	public String[] board_locations = {
				0 "Start",
				1 "The Shire",
				2 "Farmer Maggot's Crops",
				3 "The Prancing Pony",
				4 "Weather Top",
				5 "Rivendell",
				6 "Misty Mountains",
				7 "Mines of Moria",
				8 "Amon Yen"
			};
		 */
		
		Player player = new Player();
		
		for(int i = 0; i < 50; i++) {
			player.setPlayerLocation(9);
		}
		
		String output = player.getPlayerLocation();
		
		assertEquals("Start", output);
	}

}
