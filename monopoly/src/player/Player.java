package player;

public class Player {
	
	// Player Variables
	
	String name = "";
	int wallet = 1500;
	String token = "";
	String property = "";
	
	// Setters //
	
	public void set_player_name(String new_name) {
		name = new_name;
	}
	
	public void set_player_wallet(int new_wallet) {
		// wallet will increment/ decrement with what gets passed through
		wallet += new_wallet;
	}
	
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
	
	// Getters //
	
	public String get_player_name() {
		return name.toUpperCase();
	}
	
	public int get_player_wallet() {
		return wallet;
	}
	
	public String get_player_token() {
		return token;
	}
	
}
