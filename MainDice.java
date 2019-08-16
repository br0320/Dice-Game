
/*  Make a game where the user inputs how many dice to roll and how many sides each die has.
 * 
 * The user will enter a guess of what they think the total of all the dice will be.
 * 
 * The program will output the value of each die rolled and if the user's guess was correct or incorrect.
*/

import java.util.*;

public class TestingDice {

	public static void main(String[] args)
	
	{
		// Ask the user to input number of dice to roll, how many sides each dice will have and their guess of the total amount of all dice
		
		System.out.println("How many dice would you like to roll?");
		Scanner scan = new Scanner(System.in);
		
		int numOfDiceToRoll = scan.nextInt();		
		
		System.out.println("How many sides does each dice have?");
		Scanner scan1 = new Scanner(System.in);
		
		int numOfSides = scan1.nextInt();
		
		System.out.println("What is your guess of the total amount of the dice roll");
		Scanner scan2 = new Scanner(System.in);
		
		int totalGuessOfDiceRoll = scan2.nextInt();
		
		int i;
		int totalValueOfAllDice = 0;
		
		for (i = 1; i < numOfDiceToRoll + 1; i++) { // for loop to get the face value of each dice rolled
			
			Dice die = new Dice(numOfSides);
			
			die.rollDice();
			System.out.println("The value of die "+ i +" is: " + die.getFaceValue());
			
			totalValueOfAllDice = totalValueOfAllDice + die.getFaceValue();
		}
		
	
		System.out.println("You guessed the total amount of the dice roll would be: " + totalGuessOfDiceRoll + "\n");
		System.out.println("The total value of all the dice is: " + totalValueOfAllDice + "\n");
		
		if(totalGuessOfDiceRoll == totalValueOfAllDice ) { // if/ else statement to determine if the user's guess is correct or incorrect
			
			System.out.println("Winner Winner, Chicken Dinner! You guessed correctly!");
			
		} else {
			
			System.out.println("Loser! Your guess was WRONG!!!!");
		}
		
		{
			//Close the scanner objects
			
			scan.close();
			scan1.close();
			scan2.close();
		}

	} //end of main method
	
}
