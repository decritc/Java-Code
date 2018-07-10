 import java.util.Random;         
 public class HelloWorld         
 {            
   public static void main(String[] args)            
   { 
     Random randomGenerator = new Random(); 
     int randomInt = randomGenerator.nextInt(100); 
     System.out.println("Generated : " + randomInt + "." ); 
   }
 }