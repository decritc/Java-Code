import java.util.Scanner;
  
public class Mycalc {  
  
  public static void main(String args[])   
  { 
    Scanner scan = new Scanner(System.in);
    int num1;
    int num2;
    for (int x = 0; x < 3; x++)
    {
      System.out.println("Enter a value between 1 and 4 such that 1=addition, 2=subtraction, 3=multiplication, and 4=division.");
      int operation = scan.nextInt();
    
   
      switch(operation)     
      {       
        case 1:           
          System.out.println("Addition");           
          System.out.println("Please enter the augend.");
          num1 = scan.nextInt();
          System.out.println("Please enter the addend.");
          num2 = scan.nextInt();
          int sum = num1 + num2;
          System.out.println("The sum is " + sum);
          break;       
      
        case 2:           
          System.out.println("Subtration");  
          System.out.println("Please enter the minuend.");
          num1 = scan.nextInt();
          System.out.println("Please enter the subtrahend.");
          num2 = scan.nextInt();
          int difference = num1 - num2;
          System.out.println("The difference is " + difference);
          break;
      
        case 3:           
          System.out.println("Multiplication");
          System.out.println("Please enter the multiplicand.");
          num1 = scan.nextInt();
          System.out.println("Please enter the multiplier.");
          num2 = scan.nextInt();
          int  product = num1 * num2;
          System.out.println("The product is " + product);
          break;       
      
        default:           
          System.out.println("Division");
          System.out.println("Please enter the dividend.");
          double dividend = scan.nextDouble();
          System.out.println("Please enter the divisor.");
          double divisor = scan.nextDouble();
          double quotient = dividend / divisor;
          System.out.println("The quotient is " + quotient + ".");
          break; 
      }
    
    } 
  } 
}