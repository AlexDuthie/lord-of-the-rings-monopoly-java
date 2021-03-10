package game;

import java.util.Scanner;

public class Game {
	
	public static Scanner input = new Scanner(System.in);
	int players = 0;
	static int userNumAnswer;
	
	public static void startGame() {
		Game monopoly = new Game();
		
		do {
			System.out.println("How many players? (2 max)");
			userNumAnswer = input.nextInt();
		} while(userNumAnswer > 2 || userNumAnswer < 1);
		
		monopoly.setBoardPlayers(userNumAnswer);
		
		switch(monopoly.getBoardPlayers()) {
			case 1:
				monopoly.playSinglePlayerMode();
				break;
			case 2:
				monopoly.playTwoPlayerMode();
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
	
	public void playSinglePlayerMode() {
		Player p1 = new Player();
		Dice dice = new Dice();
		
		System.out.println("\nPlayer 1\n---\nPick a Token:");
		
		for(int i = 0; i < p1.tokens.length; i++) {
			System.out.println((i+1) + ". " + p1.tokens[i][0]);
		}
		
		userNumAnswer = input.nextInt();
		p1.setPlayerToken(userNumAnswer);
		p1.setPlayerName(p1.getPlayerToken());
		
		do {
			System.out.println("\nWallet: " + p1.getPlayerWallet());
			System.out.println("Debt: " + p1.getPlayerDebt());
			System.out.println("Owned Properties:\n" + p1.property);
			System.out.println("Spaces Taken " + p1.getPlayerMoves());
			
			dice.rollDice();
			System.out.println(dice.getFirstDiceNum());
			System.out.println(dice.getSecondDiceNum());
			System.out.println("\nYou rolled: " + dice.getDiceResult());
			
			p1.setPlayerMoves(dice.getDiceResult());
			p1.setPlayerLocation(p1.getPlayerMoves());
			
			System.out.println("\nYou Landed on: " + p1.getPlayerLocation());
			System.out.println("Location Price: " + p1.getPlayerLocationPrice());
			
			System.out.println("\n1. Roll Again? or 2. Buy Property?");
			userNumAnswer = input.nextInt();
			
			if(userNumAnswer == 2) {
				System.out.println("You have purchased " + p1.getPlayerLocation());
				p1.setPlayerWallet(- p1.getPlayerLocationPrice());
				p1.property = p1.getPlayerLocation();
			}
		} while(p1.getPlayerWallet() > p1.getPlayerDebt());
		
		input.close();
	}
	
	public void playTwoPlayerMode() {
		Dice dice = new Dice();
		Player p1 = new Player();
		Player p2 = new Player();
		
		System.out.println("\nPlayer 1\n---\nPick a Token:");
		
		for(int i = 0; i < p1.tokens.length; i++) {
			System.out.println((i+1) + ". " + p1.tokens[i][0]);
		}
		
		userNumAnswer = input.nextInt();
		p1.setPlayerToken(userNumAnswer);
		p1.setPlayerName(p1.getPlayerToken());
		
		System.out.println("\nPlayer 2\n---\nPick a Token:");
		
		for(int i = 0; i < p2.tokens.length; i++) {
			System.out.println((i+1) + ". " + p2.tokens[i][0]);
		}
		
		userNumAnswer = input.nextInt();		
		p2.setPlayerToken(userNumAnswer);
		
		if(p2.getPlayerToken() == p1.getPlayerToken()) {
			System.out.println("\nPlayer 2\n---\nPick a Token:");
			
			for(int i = 0; i < p2.tokens.length; i++) {
				System.out.println((i+1) + ". " + p2.tokens[i][0]);
			}
		}
		
		p2.setPlayerName(p2.getPlayerToken());
		
		do {
			System.out.println("\nPlayer 1's Turn\n---\n\nWallet: " + p1.getPlayerWallet());
			System.out.println("Debt: " + p1.getPlayerDebt());
			System.out.println("Owned Properties:\n" + p1.property + "\n");
			System.out.println("Spaces Taken " + p1.getPlayerMoves());
			
			dice.rollDice();
			System.out.println("\nYou rolled: " + dice.getDiceResult());
			
			p1.setPlayerMoves(dice.getDiceResult());
			p1.setPlayerLocation(p1.getPlayerMoves());
			
			System.out.println("\nYou Landed on: " + p1.getPlayerLocation());
			System.out.println("Location Price: " + p1.getPlayerLocationPrice());
			
			System.out.println("\n1. Next Turn? or Buy Property?");
			userNumAnswer = input.nextInt();
			
			if(userNumAnswer == 2) {
				System.out.println("You have purchased " + p1.getPlayerLocation());
				p1.setPlayerWallet(- p1.getPlayerLocationPrice());
				p1.property = p1.getPlayerLocation();
			}
			
			System.out.println("\nPlayer 2's Turn\n---\n\nWallet: " + p2.getPlayerWallet());
			System.out.println("Current Debt: " + p2.getPlayerDebt());
			System.out.println("\nOwned Properties:\n" + p2.property + "\n");
			System.out.println("Spaces Taken " + p2.getPlayerMoves());
			
			dice.rollDice();
			System.out.println("\nYou rolled: " + dice.getDiceResult());
			
			p2.setPlayerMoves(dice.getDiceResult());
			p2.setPlayerLocation(p2.getPlayerMoves());
			
			System.out.println("\nYou Landed on: " + p2.getPlayerLocation());
			System.out.println("Location Price: " + p2.getPlayerLocationPrice());
			
			System.out.println("\n1. Next Turn? or 2. Buy Property?");
			userNumAnswer = input.nextInt();
			
			if(userNumAnswer == 2) {
				System.out.println("You have purchased " + p2.getPlayerLocation());
				p2.setPlayerWallet(- p2.getPlayerLocationPrice());
				p2.property = p2.getPlayerLocation();
			}
		} while(p1.getPlayerWallet() > p1.getPlayerDebt() || p2.getPlayerWallet() > p2.getPlayerDebt());
		
		input.close();
	}
	
}
