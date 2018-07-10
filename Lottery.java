
import java.util.Random;
import java.util.ArrayList;

public class Lottery
{
  public static void main (String[] args)
  {
    System.out.println("Beginning lottery drawing, stay tuned for results..");
    sleep (2000);
    Random randomGenerator = new Random();
    ArrayList<Integer> lotteryResults = new ArrayList<Integer>();
    
    int numberInDrawing = 0;
    while (lotteryResults.size() < 6) { 
      do {
        numberInDrawing = randomGenerator.nextInt(50) + 1;
    
      }while (lotteryResults.contains(numberInDrawing)); 
      lotteryResults.add(numberInDrawing);
    }
    System.out.println("The results of today's lottery are:");
    sleep (1000);
    for (int result : lotteryResults) {
      sleep (500);
      System.out.println(result);
      }
  }
  private static void sleep (int duration) {
    try {
      Thread.sleep (duration);
    }catch (Exception e) {}
  }
}