package game;


public class Board {
	
	// board players
	public int players = 0;
	// board locations (main locations from Lord of the Rings: Fellowship of the Ring)
	public String[][] board_locations = {
			{"Start"},
			{"The Shire"},
			{"Farmer Maggot's Crops"},
			{"The Prancing Pony"},
			{"Weather Top"},
			{"Rivendell"},
			{"Misty Mountains"},
			{"Mines of Moria"},
			{"Amon Yen"}
	};
	
	// default starting point
	public String board_location = board_locations[0][0];
	
	// Board Players
	
	public void set_players(int new_players) {
		players += new_players;
		
		if(players > 4) {
			return;
		}
	}
	
	public int get_players() {
		return players;
	}
	
	// Player Location
	
	public void set_player_location(int player_spaces) {
		// condition to prevent error when surpassing the board length
		if(player_spaces >= board_locations.length) {
			board_location = board_locations[player_spaces - board_locations.length][0];
		} else {
			board_location = board_locations[player_spaces][0];
		}
	}
	
	public String get_player_location() {
		return board_location;
	}
	
}
