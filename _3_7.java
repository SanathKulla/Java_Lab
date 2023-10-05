import java.util.*;

public class _3_7{
   public static void main(String [] args){
        String ss;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        ss = sc.next();
        int n = ss.length();
        StringBuilder s = new StringBuilder(ss);
        for(int i = 0;i<n/2;i++){
             char tmp = s.charAt(i);
             s.setCharAt(i,s.charAt(n-i-1));
             s.setCharAt(n-i-1,tmp); 
        }
        ss = s.toString();
        System.out.println("the reversed string is " + ss);
      
   
   }
 
  
}
