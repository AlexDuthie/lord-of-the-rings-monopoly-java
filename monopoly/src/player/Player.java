package player;

public class Player {

	String name = "Not Declared";
	int wallet = 1500;
	
	String token;
	public String[] tokens = {
			"battleship", 
			"boot", 
			"cannon",
			"horse",
			"rider",
			"iron", 
			"racecar", 
			"dog", 
			"thimble", 
			"top hat",
			"wheelbarrow"
			};
	
	public void set_player_name(String new_name) {
		name = new_name;
	}
	
	public void set_player_wallet(int new_wallet) {
		wallet = new_wallet;
	}
	
	public void set_player_token(int new_token) {
		token = tokens[new_token];
	}
	
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
