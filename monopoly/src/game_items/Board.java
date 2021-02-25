package game_items;

public class Board {
	
	public int player_spaces = 0;
	public String board_location = "";
	
	// Reference: https://monopoly.fandom.com/wiki/List_of_Monopoly_Properties
	public String[] board_locations = {
			"Start",
			"Place 1",
			"Place 2",
			"Place 3",
			"Place 4",
			"Place 5",
			"Place 6",
	};
	
	public void set_player_location(int player_moves) {
		player_spaces += player_moves;
		
		if(player_moves >= board_locations.length) {
			// 8, 
			System.out.println("Full Circle!");
			board_location = board_locations[player_moves - board_locations.length];
		} else {
			board_location = board_locations[player_moves];
		}
	}
	
	public String get_board_location() {
		return board_location;
	}
	
	public int get_player_spaces() {
		return player_spaces;
	}
}
