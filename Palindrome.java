import java.util.*;

public class Palindrome{
 
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
           System.out.println("Enter a number");        
        int num = sc.nextInt();
        String s = String.valueOf(num);
        StringBuilder temp = new StringBuilder();
        for(int i = 0;i<s.length();i++){
           temp.append(s.charAt(i));
        }
        temp.reverse();
        s = temp.toString();
        int rnum = Integer.parseInt(s);
        if(num == rnum){
           System.out.println("Palindrome");
        }else{
           System.out.println("Not a Palindrome");
        }
        
    }

}
