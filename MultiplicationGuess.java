import java.util.Random;
import java.util.Scanner;
  
public class MultiplicationGuess{

  public static void main (String[] args) 
  {
    int num1;
    int num2;
    int num3;
    int guess;
    String again;
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    Boolean continueLoop = true;
    while (continueLoop == true)
    {
      num1 = rand.nextInt(13);
      num2 = rand.nextInt(13);
      num3 = num1 * num2;
      System.out.println("Guess the product of two numbers between 0 and 12:");
      guess = scan.nextInt();
      if (guess == num3){
        System.out.println("CORRECT");
      }else{
        System.out.println("WRONG");
      }
      System.out.println("Would you like to play again? (Y = yes, N = no)");
      again = scan.next();
      
      if (again.equalsIgnoreCase("y") != true){
        continueLoop = false;
        scan.close();
      }
    }
  }
}