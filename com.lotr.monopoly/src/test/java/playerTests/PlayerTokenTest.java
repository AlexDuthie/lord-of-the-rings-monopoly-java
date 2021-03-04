package playerTests;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Player;

public class PlayerTokenTest {

	@Test
	public void test() {
		Player player = new Player();
		
//		public String[][] tokens = {
//				{"Gandalf", "Welcome Gandalf, on time as always!"},
//				{"Aragorn", "Welcome Aragorn... or do you still go by Strider?"},
//				{"Gimli", "Welcome Gimli! You can put the Axe down now..."},
//				{"Legolas", "Welcome Legolas! Slay any Oliphaunts today?"},
//				{"Boromir", "Welcome Boromir, Gondor will be by your side!"},
//				{"Frodo", "Welcome Frodo! ... need me to hold the One Ring while you play?"},
//				{"Sam", "Welcome Samwise! Did you bring the taters?"},
//				{"Pippin", "Welcome Pippin! You didn't bring Treebeard this time did you?"},
//				{"Merry", "Welcome Merry! You look taller... are you taller?"}
//		};
		
		player.setPlayerToken(1);
		
		String output = player.getPlayerToken();
	
		assertEquals("Gandalf", output);
	}

}
