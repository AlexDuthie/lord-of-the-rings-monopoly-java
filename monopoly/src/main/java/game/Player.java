package game;


public class Player {
	
	// player name
	String name = "";
	
	// default wallet
	int wallet = 1500;
	
	// default debt
	int debt = 0;
	
	// token that the player moves with
	String token = "";
	
	// player properties (might need to turn into array)
	String property = "";
	
	// player spaces
	public int player_spaces = 0;
	
	// board locations (main locations from Lord of the Rings: Fellowship of the Ring)
	public String[] board_locations = {
			"Start",
			"The Shire",
			"Farmer Maggot's Crops",
			"The Prancing Pony",
			"Weather Top",
			"Rivendell",
			"Misty Mountains",
			"Mines of Moria",
			"Amon Yen"
	};
	
	// default starting point
	public String board_location = board_locations[0];
	
	// Name
	
	public void set_player_name(String new_name) {
		name = new_name;
	}
	
	public String get_player_name() {
		return name;
	}
	
	// Wallet
	
	public void set_player_wallet(int new_wallet) {
		// wallet will increment/ decrement with what gets passed through
		wallet += new_wallet;
	}
	
	public int get_player_wallet() {
		return wallet;
	}
	
	// Debt
	
	public void set_player_debt(int new_debt) {
		// debt will increase/ decrease with parameters input
		debt += new_debt;
	}
	
	public int get_player_debt() {
		return debt;
	}
	
	// Token
	
	public void set_player_token(int new_token) {
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
		
		token = tokens[new_token];
	}
	
	public String get_player_token() {
		return token;
	}
	
	// Player Spaces
	
	public void set_player_spaces(int new_player_spaces) {
		player_spaces += new_player_spaces;
	}
	
	public int get_player_spaces() {
		return player_spaces;
	}
	
	// Player Location
	
	public void set_player_location(int player_spaces) {
		// condition to prevent error when surpassing the board length
		if(player_spaces >= board_locations.length) {
			board_location = board_locations[player_spaces - board_locations.length];
			set_player_wallet(200);
		} else {
			board_location = board_locations[player_spaces];
		}
	}
	
	public String get_player_location() {
		return board_location;
	}
	
}
