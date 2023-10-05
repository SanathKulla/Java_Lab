import java.util.*;

public class _3_1{
   public static void main(String [] args){
        String source,target;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the source string");
        source = sc.nextLine();
        System.out.println("Enter the target string");
        //target = sc.nextLine(); 
        int val = source.compareTo(target = sc.nextLine());
        if(val == 0)        System.out.println("Both strings are lexicographically equal");
        else if(val < 0)        System.out.println("Source is lexicographically smaller than target");
        else         System.out.println("source is lexicographically larger than target ");
   
   }
 
  
}
