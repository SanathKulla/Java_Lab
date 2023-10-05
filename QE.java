import java.util.*;

public class QE{
 
    public static void main(String [] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a and b and c values of the equation ax^2 + bx + c = 0");
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          int det = b*b - 4*a*c;
          if(det < 0){
          System.out.println("Imaginary roots are");    
          det*=-1;
          System.out.println((-1*b*1.0)/(2.0*a) + " + " +  Math.sqrt(det)/(2.0*a) + "i") ; 
          System.out.println((-1*b*1.0)/(2.0*a) + " - " +  Math.sqrt(det)/(2.0*a) + "i") ;      
          }else{
          double val =  det;
          val = Math.sqrt(val);
           System.out.println("Real roots are");                  
          System.out.println((-b - val )/(2.0*a) + " , " +  (-b + val )/(2.0*a) ) ;       
          }
    }

}
