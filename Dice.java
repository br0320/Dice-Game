/*  Make a game where there are two 6-sided dice and the player has 3 attempts to guess the total roll of both dice.
	11/13/2018 - Test Change
	04/03/2019 - Updated the program to ask for the number of dice to roll.
	04/03/2019 - Updated the way some of the output is displayed
	04/04/2019 - Cleaned up some of the comments and added escape characters for next line
*/

import java.util.*;

public class Dice { 
	
	public static void main(String[] args) { 	
		
		int sumofDice = 0;	
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
/*		Request user input for parameters of the dice roll
		For loop to roll the number of dice from user input
		Sum up all the dice in the roll
		Check sum of dice to see if it matches users guess
*/
		
		System.out.println("Hello! Guess the total roll of both dice!" + "\n");	
		System.out.println("How many dice would you like to roll?" + "\n");	
		
		int howManyDice = scan.nextInt(); 
	
		System.out.println("What is your guess?"); 		
		int guess = scan.nextInt(); 
		
		System.out.println("Your guess is " + guess + "!"+ "\n");	
		System.out.println("Let's see how you did!"+ "\n");
		
			for (int x = 0; x<howManyDice; x++) { 
				int diceRoll = rand.nextInt(6) + 1; 
				
				System.out.println(diceRoll);
				sumofDice = sumofDice + diceRoll; 				
			}
			
			System.out.println("\n" + "The sum of the " +howManyDice + " dice is " +sumofDice+ "!"+ "\n");		
			
			// If loop to check if the user's guess was correct	
			if (guess == sumofDice) { 			
	
				System.out.println("Winner! Winner! Chicken Dinner!");				
			} 
			
			else{
				
				System.out.println("Sorry that is incorrect! LOSER!!!!");
			}
			
			scan.close();
		
	} // End of main

} // End of class
