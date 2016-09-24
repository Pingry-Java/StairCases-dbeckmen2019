import java.util.Scanner;

/**
 * This class represents a program that will print ascending and descending x's according to user
 * inputted dimensions
 * @author Drew Beckmen
 * @author Josh Orndorff
 * @version 1.0
 */

public class StairCases
{
  /**
   * Main method demonstrates the other two methods by calling each of them.
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
   * @param dimension of staircase
   * prints directly to screen. returns void
   */

  public static void printAscending(int dimensions) //DONT FORGET: dimensions is a new variable so much be given type
  	{
  		//Counter will be used to make sure inner for loop happens 1 addition time each run through
  		int counter = dimensions;
  		
  		for (int x = 1; x <= dimensions; x++) //Do what is inside of this loop xDimensions
  		{
  			counter++; //So each time we go through loop, inner for loop is gone through 1 more time
  			
  			//Crucial: Every time you go into this loop, y will reset to inputted dimensions
  			for (int y = dimensions; y < counter; y++)
  			{
  				System.out.print("x ");
  			}
  			
  			System.out.println();
  		}
  	
  	}

  /**
   * printDescending prints a staircase of x's starting at inputted number down to x
   * @param dimensions of staircase
   */
  public static void printDescending(int dimensions)
  {
  	
  	//Make counter 1 more than dimensions so that you can subtract 1 each time you go through outer for loop
  	int counter = (dimensions + 1);
  	
  	for (int x = 1; x <= dimensions; x++)
  	{
  		counter--; //Subtract one from counter each time so that goes through inner loop 1 less time
  		for (int y = 1; y <= counter; y++)
  		{
  			System.out.print("x ");
  		
  		} 
  		System.out.println();
  	}
  }
}
