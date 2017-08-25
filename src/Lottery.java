import java.util.Random;

/**
   The Lottery class stores data about a lottery
   for the Lottery Application programming challenge.
*/

public class Lottery
{
   //TODO: Declare Class Fields
   static int[] LotteryNumber = new int[5];
   /**
      The constructor initializes the object with
      a random lottery number.
   */
      
   public Lottery()
   {
      //TODO: constructor method
	   Random rand = new Random();
	   
	   for (int i=0; i < LotteryNumber.length; i++)
		   LotteryNumber[i] = rand.nextInt(10);
   }
   
   /**
      The numMatching method determines the number
      of digits in the argument array that match the 
      ones in the lotteryNumbers array.
      @param picks The array to compare against the
                   lottteryNumbers array.
      @return The number of matching digits.
   */
   
   public int numMatching(int[] picks)
   { int count = 0;
	 for (int i = 0; i < LotteryNumber.length; i++)
	   if (LotteryNumber[i] == picks[i])
		   count += 1;
      //TODO
      return count;
   }

   /**
      The copy method makes a copy of the
      lotteryNumbers array.
      @return A reference to the copy.
   */
   
   public int[] copy()
   {
	  //TODO
      int[] temp;
      temp = new int[LotteryNumber.length];
      for (int i=0; i < LotteryNumber.length; i++)
    	  temp[i] = LotteryNumber[i];
      return temp;
   }

}
