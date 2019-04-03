// Make a game where there are two 6-sided dice and the player has 3 attempts to guess the total roll of both dice.
// 11/13/2018 - Test Change
// 04/03/2019 - Updated the program to ask for the number of dice to roll.
// 04/03/2019 - Updated the way some of the output is displayed

import java.util.*;

public class Dice { 
	
	public static void main(String[] args) { 	
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Hello! Guess the total roll of both dice!");	
		System.out.println(" ");	
		
		System.out.println("How many dice would you like to roll?");	
		System.out.println(" ");
		
		int howManyDice = scan.nextInt(); //Get the user input of the number of dice to roll
		int dicetotal = 0;	
	
		System.out.println("What is your guess?"); 		
		int guess = scan.nextInt(); // Get the input of the number the user guessed
		
		System.out.println(" ");
		System.out.println("Your guess is " + guess + "!" );	
		System.out.println(" ");
		System.out.println("Let's see how you did!");
		System.out.println(" ");		
	
		
			for (int x = 0; x<howManyDice; x++) { // For loop to get the random dice rolls for the amount of dice the user inputted
				int dice = rand.nextInt(6) + 1; 
				
				System.out.println(dice);
				dicetotal = dicetotal + dice; // Add up the total of the dice rolls
				
			}
			
			System.out.println("The sum of the " +howManyDice + " dice is " +dicetotal+ "!");
			System.out.println(" ");
			
		
			if (guess == dicetotal) { // If loop to check if the user's guess was correct				
	
				System.out.println("Winner! Winner! Chicken Dinner!");
				
			} 
			
			else{
				
				System.out.println("Sorry that is incorrect! LOSER!!!!");
			}
			
			scan.close();
		
	} // End of main

} // End of class
