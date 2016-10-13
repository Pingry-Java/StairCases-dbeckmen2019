import java.util.Scanner;

/**
 * This class represents a program that will print ascending and descending x's according to user
 * inputted dimensions
 * @author Drew Beckmen
 * @author Josh Orndorff
 * @version 1.1
 */

public class StairCases
{
  /**
   * Main method demonstrates the other two methods by calling each of them.
   * Asks for user input for dimensions
   * @param args Standard array of commandline String arguments. Not used in this program.
   */

  public static void main(String[] args)
  {
    //Creating instance keyboard of class Scanner
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Tell me the length of the longest row in the ascending and descending staircases: ");
    int size = keyboard.nextInt();
    
    //Clear the command line in terminal. 
    keyboard.nextLine(); 
   
    printAscending(size);
    
    //Print an extra line for formatting purposes
    System.out.println();
    
    printDescending(size);
  }

  /**
   * printAscending prints the staircase of x's from 1 up to inputted number
   * Prints using a recursive algorithm (head recursion)
   * @param dimensions of staircase
   */

  public static void printAscending(int dimensions) //DONT FORGET: dimensions is a new variable so much be given type
  	{
  		if (dimensions > 1)
  		{
  			printAscending(dimensions - 1); 
  		}
  		for (int i = 0; i < dimensions; i++)
  		{
  			System.out.print("x "); 
  		}
  		System.out.println(); 
  	}
  	 
   /**
   * printDescending prints a staircase of x's starting at inputted number down to x
   * Prints using a recursive algorithm (tail recursion) 
   * @param dimensions of staircase
   */
  public static void printDescending(int dimensions)
  {
  	//Opposite of ascending. X starts at high end and decreases each time
  	for (int i = 0; i < dimensions; i++)
  	{
  		System.out.print("x "); 
  	}
  	System.out.println(); 
  	if (dimensions > 1)
  		printDescending(dimensions - 1); 
  }
}

 
