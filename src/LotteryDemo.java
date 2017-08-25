import java.util.Scanner;
import java.util.Arrays;

/**
   This program demonstrates a solution to the
   Lottery Application programming challenge.
*/

public class LotteryDemo
{
   public static void main(String[] args)
   {
      //TODO: declare relevant variables
	   int[] User = new int[5];
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Create a Lottery object.
      Lottery Lot = new Lottery();
      int[] Num1 = Lot.copy();
      
      // Get the user's picks.
      for (int i=0; i <5; i++)
    	  {System.out.println("Please enter a number from 0-9");
          int x = keyboard.nextInt();
          User[i] = x;
          }
      // Compare.
      System.out.println("Lottery Array: " + Arrays.toString(Lot.copy()));
      System.out.println("Your Array: " + Arrays.toString(User));
      System.out.println("Matches: " + Lot.numMatching(User));
      // Display the results.
      if (Arrays.equals(Lot.copy(), User) == true)
    	  System.out.println("Winner!");
    	  
      
   }
}