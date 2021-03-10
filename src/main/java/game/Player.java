package game;


public class Player {
	
	String name = "";
	int wallet = 1500;
	int debt = 0;
	public String[][] tokens = {
			{"Gandalf", "Welcome Gandalf, on time as always!"},
			{"Aragorn", "Welcome Aragorn... or do you still go by Strider?"},
			{"Gimli", "Welcome Gimli! You can put the Axe down now..."},
			{"Legolas", "Welcome Legolas! Slay any Oliphaunts today?"},
			{"Boromir", "Welcome Boromir, Gondor will be by your side!"},
			{"Frodo", "Welcome Frodo! ... need me to hold the One Ring while you play?"},
			{"Sam", "Welcome Samwise! Did you bring the taters?"},
			{"Pippin", "Welcome Pippin! You didn't bring Treebeard this time did you?"},
			{"Merry", "Welcome Merry! You look taller... are you taller?"}
	};
	String token = "";
	String property = "";
	int playerMoves = 0;
	public static String[][] boardLocations = {
			
			// Board Corner 1
			{"Go", "200"},
			
			{"The Shire", "60"},
			{"Community Chest"},
			{"Farmer Maggot's Crops", "60"},
			{"Income Tax", "200"},
			{"The Prancing Pony", "100"},
			{"Chance"},
			{"Weather Top", "100"},
			{"Rivendell", "120"},
			
			// Board Corner 2
			{"Just Visiting", "In Mordor"},
			
			{"Misty Mountains", "140"},
			{"Mines of Moria", "150"},
			{"Amon Hen", "160"},
			{"Fanghorn Forest", "200"},
			{"Rohan", "180"},
			{"Community Chest"},
			{"Helms Deep", "180"},
			{"Gondor", "200"},
			
			// Board Corner 3
			{"Free Parking"},
			
			{"Minus Tiriuth", "220"},
			{"Chance"},
			{"Pelennor Fields", "220"},
			{"The Dead Marshes", "240"},
			{"Minas Morgal", "200"},
			{"Isengard", "260"},
			{"Zirakzigil", "260"},
			{"Valinor", "150"},
			{"Northern Mirkwood", "280"},
			
			// Board Corner 4
			{"Go To Mordor"},
			{"Edoras", "300"},
			{"Anduin River", "300"},
			{"Community Chest"},
			{"Ithilien", "320"},
			{"Doors of Durin", "200"},
			{"Chance"},
			{"Lothlórien", "350"},
			{"Luxury Tax", "100"},
			{"Grey Havens", "400"}
	};
	
	String boardLocation = boardLocations[0][0];
	
	int boardLocationPrice;
	
	public void setPlayerToken(int newToken) {
		token = tokens[newToken-1][0];
		
		System.out.println("\n---\nToken Selected: " + getPlayerToken());
		System.out.println(tokens[newToken-1][1] + "\n---");
	}
	
	public String getPlayerToken() {
		return token;
	}
	
	public void setPlayerName(String newName) {
		name = newName;
	}
	
	public String getPlayerName() {
		return name;
	}
	
	public void setPlayerWallet(int newWallet) {
		wallet += newWallet;
	}
	
	public int getPlayerWallet() {
		return wallet;
	}
	
	public void setPlayerDebt(int newDebt) {
		debt += newDebt;
	}
	
	public int getPlayerDebt() {
		return debt;
	}
	
	public void setPlayerMoves(int newPlayerMovesCount) {
		playerMoves += newPlayerMovesCount;
	}
	
	public int getPlayerMoves() {
		return playerMoves;
	}
	
	public void setPlayerLocation(int playerMoves) {
		if(playerMoves >= boardLocations.length) {
			System.out.println("You passed " + getPlayerLocation());
			
			boardLocation = boardLocations[playerMoves - boardLocations.length][0];
			
			boardLocationPrice = Integer.parseInt(boardLocations[playerMoves - boardLocations.length][1]);
			
			setPlayerWallet(Integer.parseInt(boardLocations[0][1]));
		} else {
			boardLocation = boardLocations[playerMoves][0];
			boardLocationPrice = Integer.parseInt(boardLocations[playerMoves][1]);
		}
	}
	
	public String getPlayerLocation() {
		return boardLocation;
	}
	
	public int getPlayerLocationPrice() {
		return boardLocationPrice;
	}
}
