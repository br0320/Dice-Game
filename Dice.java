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
