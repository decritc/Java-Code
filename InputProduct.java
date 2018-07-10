import java.util.Scanner;

public class InputProduct{

  public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please enter a number.");
    
    int firstNumber = scan.nextInt();
    
    System.out.println("Please enter a second number.");
    int secondNumber = scan.nextInt();
    
    System.out.println("The product of the two numbers is "+ (firstNumber*secondNumber));
      
    System.out.print("The largest of the two numbers is ");
    
    if (firstNumber > secondNumber){
      System.out.println(firstNumber);
    }else {
      System.out.println(secondNumber);
    }
  }
}