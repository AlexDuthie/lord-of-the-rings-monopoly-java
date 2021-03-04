package game;


import java.util.Random;
import java.util.Scanner;

public class Dice {
	
	public Scanner input = new Scanner(System.in);
	
	Random randomise = new Random();
	
	public int dice1 = 0;
	public int dice2 = 0;
	public int diceResult = 0;
	
	// Dice 1
	public void rollDice1() {
		do {
			dice1 = randomise.nextInt(7);
		} while(dice1 == 0);
	}
	
	public int getRolledDice1() {
		return dice1;
	}
	
	// Dice 2
	
	public void rollDice2() {
		do {
			dice2 = randomise.nextInt(7);
		} while(dice2 == 0);
	}
	
	public int getRolledDice2() {
		return dice2;
	}
	
	// Roll Dice
	
	public int roll_dice() {
		System.out.println("\nRoll Dice? (Yes or No)");
		String answer = input.nextLine().toLowerCase();
		
		if(answer.equals("yes")) {
			rollDice1();
			rollDice2();
		}
		
		diceResult = getRolledDice1() + getRolledDice2();
		
		return diceResult;
	}
	
	public int getDiceResult() {
		return diceResult;
	}
	
}
