package game;


import java.util.Random;
import java.util.Scanner;

public class Dice {
	
	public Scanner input = new Scanner(System.in);
	
	Random randomise = new Random();
	
	public int firstDieNumber = 0;
	public int secondDieNumber = 0;
	public int rolledDiceNumber = 0;
	
	public void rollFirstDice() {
		
		do {
			firstDieNumber = randomise.nextInt(1+6);			
		} while(firstDieNumber == 0);
	}
	
	public int getFirstDiceNum() {
		return firstDieNumber;
	}
	
	public void rollSecondDice() {
		do {
			secondDieNumber = randomise.nextInt(1+6);			
		} while(secondDieNumber == 0);
	}
	
	public int getSecondDiceNum() {
		return secondDieNumber;
	}
	
	public int rollDice() {
		rollFirstDice();
		rollSecondDice();
		
		rolledDiceNumber = (getFirstDiceNum() + getSecondDiceNum());
		
		return rolledDiceNumber;
	}
	
	public int getDiceResult() {
		return rolledDiceNumber;
	}
}
