import java.util.*;

public class UniqueNumbers
{
  public static void main (String[] args)
  {
    System.out.println("Enter first number: ");
    Scanner scan = new Scanner(System.in);
    int num1 = scan.nextInt();
    
    System.out.println("Enter second number: ");
    int num2 = scan.nextInt();
    
    while (num1 == num2)
    {
      System.out.println("Not Unique, try again: ");
      num2 = scan.nextInt();
    }
    
    System.out.println("Enter third number: ");
    int num3 =scan.nextInt();
    
    while (num1 == num3 || num2 == num3)
    {
      System.out.println("Not Unique, try again: ");
      num3 = scan.nextInt();
    }
    
    List<Integer> numList = new ArrayList<Integer>();
    
    numList.add(num1);
    numList.add(num2);
    numList.add(num3);
    
    Collections.sort(numList);
    
    System.out.println("Here are your sorted numbers: " + numList);
  }
}