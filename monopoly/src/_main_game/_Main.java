// Monopoly | Alex Duthie - 12010280

package _main_game;

import java.util.Scanner;

import game_items.Dice;
import player.Player;

public class _Main {

	public static void main(String[] args) {
		
		int wallet = 1500;
		
		Scanner input = new Scanner(System.in);
		
		Player alex = new Player();
		
		System.out.println("Your wallet: " + alex.get_player_wallet() + "\n");
		
		System.out.println("What is your name?");
		String name = input.nextLine();
		alex.set_player_name(name);
		
		System.out.println("\nSelect a token please " + alex.get_player_name());
		
		for(int i = 0; i < alex.tokens.length; i++) {
			System.out.println(i + ". " + alex.tokens[i]);
		}
		
		int token = input.nextInt();
		
		alex.set_player_token(token);
		
		System.out.println("\nYou have selected the token: " + alex.get_player_token());
		System.out.println("You have £" + alex.get_player_wallet() + " in your wallet\n");

		System.out.println("Would you like to roll your dice?\n1. Yes || 2. NO\n");
		int answer = input.nextInt();
		
		if(answer == 1) {
			Dice.go();
		} else {
			System.out.println("Why?");
		}
		
		System.out.println("\nYou have landed on this, paying fine of £300");
		
		alex.set_player_wallet(wallet -300);
		
		System.out.println(alex.get_player_wallet());
		
		input.close();
	}

}
