// Make a game where there are two 6-sided dice and the player has 3 attempts to guess the total roll of both dice.
// Test Change 20181113

import java.util.*;

public class Dice { // Start of class
	
	public static void main(String[] args) { // Start of main		
		System.out.println("Hello! You have 3 attempts to guess the correct total roll of both dice!");	
		System.out.println(" ");		
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
			
			// Declare and initialize variables
		
			int die1 = rand.nextInt(6) + 1;
			int die2 = rand.nextInt(6) + 1;
			int sum = die1 + die2;		
			
			for (int x = 0; x<3; x++) { // Start of for loop
				
				int guess = scan.nextInt();
				int guesscount = 2 - x;
				
				System.out.println("Your guess is " + guess + "!" );	
				System.out.println(" ");
				System.out.println("Let's see how you did!");
				System.out.println(" ");			
				System.out.println("Die1    Die2    Sum");				
				System.out.println("  " + die1 + "    "+ "   " + die2 + "    " + "  " + sum);	
				System.out.println(" ");
				
			if (guess == sum) { // Start of if				
	
				System.out.println("Winner! Winner! Chicken Dinner!");
				break;
				
			} // End of if
			
			else { // Start of else
					
				System.out.println("That's incorrect! You have " + guesscount + " more guess(es)!");	
				System.out.println(" ");
				
			} // End of else
				
			} // End of for loop
			
			scan.close(); // closing scan
		
	} // End of main

} // End of class
