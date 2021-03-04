package game;

import java.util.Scanner;
import game.Dice;

public class Game {
	
	public static Scanner input = new Scanner(System.in);
	int players = 0;
	static int numberAnswer = 0;
	String answer = "";
	
	public static void startGame() {
		Game monopoly = new Game();
		
		System.out.println("How many players?");
		numberAnswer = input.nextInt();
		
		monopoly.setBoardPlayers(numberAnswer);
		
		switch(monopoly.getBoardPlayers()) {
			case 1:
				monopoly.singlePlayer();
				break;
			case 2:
				monopoly.twoPlayer();
				break;
			case 3:
				monopoly.threePlayer();
				break;
			case 4:
				monopoly.fourPlayer();
				break;
			default:
				break;
		}
		
		input.close();
	}
	
	public void setBoardPlayers(int newPlayers) {
		if(newPlayers > 4 || newPlayers < 1) {
			System.out.println("Minimum Players: 1\nMaximum Players: 4");
		} else {
			players = newPlayers;
		}
	}
	
	public int getBoardPlayers() {
		return players;
	}
	
	public void singlePlayer() {
		Player p1 = new Player();
		Dice dice = new Dice();
		
		System.out.println("\nPlayer 1\n---\nPick a Token:");
		
		for(int i = 0; i < p1.tokens.length; i++) {
			System.out.println((i+1) + ". " + p1.tokens[i][0]);
		}
		
		numberAnswer = input.nextInt();
		p1.setPlayerToken(numberAnswer);
		p1.setPlayerName(p1.getPlayerToken());
		
		do {
			System.out.println("\nWallet: " + p1.getPlayerWallet());
			System.out.println("Debt: " + p1.getPlayerDebt());
			System.out.println("Owned Properties:\n" + p1.property);
			System.out.println("Spaces Taken " + p1.getPlayerSpaces());
			
			dice.roll_dice();
			System.out.println("\nYou rolled: " + dice.getDiceResult());
			
			p1.setPlayerSpaces(dice.getDiceResult());
			p1.setPlayerLocation(p1.getPlayerSpaces());
			
			System.out.println("\nYou Landed on: " + p1.getPlayerLocation());
			System.out.println("Location Price: " + p1.getPlayerLocationPrice());
			
			System.out.println("\n1. Roll Again? or 2. Buy Property?");
			numberAnswer = input.nextInt();
			
			if(numberAnswer == 2) {
				System.out.println("You have purchased " + p1.getPlayerLocation());
				p1.setPlayerWallet(- p1.getPlayerLocationPrice());
				p1.property = p1.getPlayerLocation();
			}
		} while(p1.getPlayerWallet() > p1.getPlayerDebt());
		
		input.close();
	}
	
	public void twoPlayer() {
		
	}
	
	public void threePlayer() {
		
	}
	
	public void fourPlayer() {
		
	}
	
}
