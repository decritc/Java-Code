 import java.util.Random;         
 public class RollDice        
 {            
   public static void main(String[] args)            
   { 
     System.out.println("Rolling the dice now"); 
 
     Random randomGenerator = new Random(); 
     int value1 = randomGenerator.nextInt(6) +1; 
     int value2 = randomGenerator.nextInt(6) +1;
     int sum = value1 + value2;
     
     System.out.println("The number rolled is " + sum + "." ); 
   }
 }