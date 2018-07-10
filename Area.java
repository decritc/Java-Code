import java.util.Scanner; 

public class Area 
{         
  public static void main(String[] args) 
  {           
    System.out.println("Hello! What is your name?");           
    Scanner scan = new Scanner(System.in);           
    String name = scan.next();           
    System.out.println("Welcome " + name + "! Enter the corresponding letter of the shape to calculate the surface area (c - circle, t - triangle, r - rectangle, or q - quit)");           
    String function = scan.next();                                 
    
    if (function.equalsIgnoreCase("c")) {   
      float pi = (float)3.14;
      System.out.println("Please enter the radius?");
      float radius = scan.nextFloat();
      float area = pi * radius * radius;
      System.out.println("The calculated area of the shape is " + area + ".");    
    }           
    else if (function.equalsIgnoreCase("t")){  
      System.out.println("Please enter the base?");
      float base = scan.nextFloat();
      System.out.println("Please enter the height?");
      float height = scan.nextFloat();
      float area = (float)0.5 * base * height;
      System.out.println("The calculated area of the shape is " + area + "."); 
    } 
    else if (function.equalsIgnoreCase("r")){  
      System.out.println("Please enter the base?");
      float base = scan.nextFloat();
      System.out.println("Please enter the height?");
      float height = scan.nextFloat();
      float area = base * height;
      System.out.println("The calculated area of the shape is " + area + ".");
    } 
    else if (function.equalsIgnoreCase("q")){  
      System.out.println("Goodbye!"); 
    }
  } 
} 