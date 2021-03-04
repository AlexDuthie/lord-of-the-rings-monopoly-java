package game;


public class Player {
	
	// player name
	String name = "";
	// default wallet
	int wallet = 1500;
	// default debt
	int debt = 0;
	// tokens a player can be assigned with to move around with
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
	// token that the player moves with
	String token = "";
	// player properties (might need to turn into array)
	String property = "";
	// player spaces
	int player_spaces = 0;
	// board locations, inspired by Tolkien's Middle Earth
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
	
	// default starting point
	String boardLocation = boardLocations[0][0];
	
	int boardLocationPrice;
	
	// Token
	
	public void setPlayerToken(int newToken) {
		token = tokens[newToken-1][0];
		System.out.println("\n---\nToken Selected: " + getPlayerToken());
		System.out.println(tokens[newToken-1][1] + "\n---");
	}
	
	public String getPlayerToken() {
		return token;
	}
	
	// Name
	
	public void setPlayerName(String newName) {
		name = newName;
	}
	
	public String getPlayerName() {
		return name;
	}
	
	// Wallet
	
	public void setPlayerWallet(int newWallet) {
		// wallet will increment/ decrement with what gets passed through
		wallet += newWallet;
	}
	
	public int getPlayerWallet() {
		return wallet;
	}
	
	// Debt
	
	public void setPlayerDebt(int newDebt) {
		// debt will increase/ decrease with parameters input
		debt += newDebt;
	}
	
	public int getPlayerDebt() {
		return debt;
	}
	
	// Player Spaces
	
	public void setPlayerSpaces(int newPlayerSpaces) {
		player_spaces += newPlayerSpaces;
	}
	
	public int getPlayerSpaces() {
		return player_spaces;
	}
	
	// Player Location
	
	public void setPlayerLocation(int playerSpaces) {
		// condition to prevent error when surpassing the board length
		if(playerSpaces >= boardLocations.length) {
			System.out.println("You passed " + getPlayerLocation());
			
			boardLocation = boardLocations[playerSpaces - boardLocations.length][0];
			
			boardLocationPrice = Integer.parseInt(boardLocations[playerSpaces - boardLocations.length][1]);
			
			setPlayerWallet(Integer.parseInt(boardLocations[0][1]));
		} else {
			boardLocation = boardLocations[playerSpaces][0];
			boardLocationPrice = Integer.parseInt(boardLocations[playerSpaces][1]);
		}
	}
	
	public String getPlayerLocation() {
		return boardLocation;
	}
	
	// Location Price
	
	public int getPlayerLocationPrice() {
		return boardLocationPrice;
	}
}
