package game;


import java.util.Random;
import java.util.Scanner;

public class Dice {
	
	public Scanner input = new Scanner(System.in);
	
	Random randomise = new Random();
	
	public int firstDieNumber;
	public int secondDieNumber;
	public int rolledDiceNumber;
	
	public void rollFirstDice() {
		firstDieNumber = randomise.nextInt(1+6);
	}
	
	public int getFirstDiceNum() {
		return firstDieNumber;
	}
	
	public void rollSecondDice() {
		secondDieNumber = randomise.nextInt(1+6);
	}
	
	public int getSecondDiceNum() {
		return secondDieNumber;
	}
	
	public int rollDice() {
		System.out.println("\nRoll Dice? (Yes or No)");
		String answer = input.nextLine().toLowerCase();
		
		if(answer.equals("yes")) {
			rollFirstDice();
			rollSecondDice();
		}
		
		rolledDiceNumber = getFirstDiceNum() + getSecondDiceNum();
		
		return rolledDiceNumber;
	}
	
	public int getDiceResult() {
		return rolledDiceNumber;
	}
}
