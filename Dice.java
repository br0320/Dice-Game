/*  Make a game where there are two 6-sided dice and the player has 3 attempts to guess the total roll of both dice.
	11/13/2018 - Test Change
	04/03/2019 - Updated the program to ask for the number of dice to roll.
	04/03/2019 - Updated the way some of the output is displayed.
	04/04/2019 - Cleaned up some of the comments and added escape characters for next line.
	08/16/2019 - Created a separate Dice class.
	08/16/2019 - Changed program to request user input the following: 
	             - How many dice to roll?
		     - How many sides does each dice have?
		     - What is the user's guess of the total amount of all dice of the dice roll?
*/

import java.util.*;

public class Dice {

	private int numofSides;
	private int faceValue;
	
	public Dice(int numberofSides)
	
	{
		
		numofSides = numberofSides;		
	}
	
	
	/**
	 * This method will simulate rolling the Dice object.
	 */
	
	public void rollDice()
	{
		
		Random myRandomNumGenerator = new Random();
		faceValue = myRandomNumGenerator.nextInt(numofSides) + 1;
	} // end of method rollDice()
	
	
	/**
	 * This method will return the current face value of the Dice object.
	 */
	
	public int getFaceValue()
	{
		
		return faceValue;
	} //end of method getFaceValue()
	
	
	
}
