
import java.util.Scanner;

public class LoopArray {

  public static void main (String args[])
  {
   
    Scanner myScanner = new Scanner(System.in);
    int[] myArray = new int[5];
    int maxValue = 0;
    
    for(int x = 0; x < 5; x++)
    {
      System.out.print("Hello CSCI Student, ");
      System.out.print("Enter a value between 1 and 100.\n");
      myArray[x] = myScanner.nextInt();
      if (myArray[x] > maxValue)
      {
        maxValue = myArray[x];
      }
    }
    System.out.print("The maximum value within the array is: "+ maxValue +"\n");
    int sum = 0;
    for(int x = 0; x < 5; x++) {
    
      sum += myArray[x];
    }
    System.out.print("The sum of your numbers is "+ sum + ".\n");
    
  }
}