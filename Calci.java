import java.util.*;

public class Calci{
 
    public static void main(String [] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the operation you want to peform ");  
          System.out.println("For addition  enter +"); 
          System.out.println("For Subtraction  enter -"); 
          System.out.println("For multiplication  enter *"); 
          System.out.println("For division  enter /");
          System.out.println("For power  enter ^"); 
          String c = sc.nextLine();                
          if(c.equals("+") || c.equals("-") ||c.equals("*") ||c.equals("/") ||c.equals("^")){
          System.out.println("Enter two operands in correct order"); 
          long a = sc.nextLong();
          long b = sc.nextLong();
          if(c.equals("+")){
          
          System.out.println("The result of the addition is " + (a+b) );           
          }
          if(c.equals("-")){
           
          System.out.println("The result of the subtraction is " + (a-b) );           
          } 
          if(c.equals("*")){
          
          System.out.println("The result of the multiplication is " + a*b );           
          } 
          if(c.equals("/")){
          if(b == 0){
          System.out.println("Invalid operation cant divide by zero" );
          return;           
          }
          System.out.println("The result of the division is " + a/(1.0*b) );           
          } 
          if(c.equals("^")){
          System.out.println("The result of the power is " + Math.pow(a,b) );           
          
          }                                                   
          }else{
          System.out.println("invalid operator ");           
          }                     
    }

}
