import java.util.*;

public class PrimeFactors{
    
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       ArrayList<Integer> div[] = new ArrayList[1000001];
       //for(int i = 0 ; i < 1000000 ; i++)div[i] = new ArrayList();  
       boolean prime[] = new boolean[1000001];
       for(int i = 2;i<=1000000;i++){
             if(prime[i] == false){
             if(div[i] == null)div[i] = new ArrayList();
                 div[i].add(i);
                 for(int j = 2*i;j <= 1000000;j+=i){
                    if(div[j] == null)div[j] = new ArrayList();
                    div[j].add(i);
                    prime[j] = true;
                 }
             }
       } 
       System.out.println("Enter a number");
       
       int x = sc.nextInt();
       System.out.print("The prime factors are ");
       for(Integer ele:div[x]){
       System.out.print(ele + " ");
       }
       
    }

}
