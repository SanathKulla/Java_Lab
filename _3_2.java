import java.util.*;

public class _3_2{
   public static void main(String [] args){
        String source,target;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the source string");
        source = sc.nextLine();
        System.out.println("Enter the target string");
        //target = sc.nextLine(); 
        boolean val = source.equalsIgnoreCase(sc.nextLine());
        if(val)        System.out.println("Both strings are equal, ignoring case");
        else         System.out.println("Both strings are not equal, ignoring case");
   
   }
 
  
}
