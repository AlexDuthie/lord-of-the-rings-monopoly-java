package playerTests;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Player;

public class PlayerLocationTest {

	@Test
	public void test() {
//		public static String[][] boardLocations = {
//				
//				// Board Corner 1
//	0			{"Go", "200"},
//				
//	1			{"The Shire", "60"},
//	2			{"Community Chest"},
//	3			{"Farmer Maggot's Crops", "60"},
//	4			{"Income Tax", "200"},
//	5			{"The Prancing Pony", "100"},
//	6			{"Chance"},
//	7			{"Weather Top", "100"},
//	8			{"Rivendell", "120"},
//	...			...
//	...			...
//		};
		
		Player player = new Player();
		
		player.setPlayerLocation(1);
		String output = player.getPlayerLocation();
		
		assertEquals("The Shire", output);
	}

}
