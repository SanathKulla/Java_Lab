import java.util.*;

public class _3_5{
   public static void main(String [] args){
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  string");
        s = sc.next();
        s = s.toLowerCase();
        HashSet<Character> set,vs;
        ArrayList<Character> vowels,consonants;
        set = new HashSet<>();
        vs = new HashSet<>();        
        vowels = new ArrayList<>();
        consonants = new ArrayList<>();                
        set.add('a');
        set.add('e');       
        set.add('i');
        set.add('o');
        set.add('u');                   
        for(int i = 0;i<s.length();i++){
         Character ch = s.charAt(i);
         if(set.contains(ch)){
          vowels.add(ch);
          vs.add(ch);
         }
         else consonants.add(ch);
        
        }
        System.out.println("The Vowels present in string are");
        for(Character ch : vs){
        System.out.print(ch + " ");
        }
        System.out.println();        
        System.out.println("The no.of Vowels present in string are " + vowels.size());
        System.out.println("The no.of consonants present in string are " + consonants.size());          
        
   }
 
  
}
