package game_items;

public class Board {

	public int player_spaces = 0;
	public String board_location = "";
	public String[] board_locations = {
			"Place1",
			"Place2",
			"Place3",
			"Place4",
			"Place5",
			"Place6",
			"Place7",
			"Place8",
	};
	
	public void set_player_position(int player_moves) {
		player_spaces += player_moves - 1;
		board_location = board_locations[player_spaces];
	}
	
	public int get_player_position() {
		return player_spaces;
	}
	
	public String get_board_location() {
		return board_location;
	}
}
