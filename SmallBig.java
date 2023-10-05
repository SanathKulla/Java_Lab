import java.util.*;

public class SmallBig{
 
    public static void main(String [] args){
          determine d = new determine(1,2,3,4,5);
          d.print_min();
          d.print_max();
    }

}

class determine{
    int a1,a2,a3,a4,a5;
    determine(){
         this(0,0,0,0,0);
    }
    determine(int a1){
         this(a1,0,0,0,0);
    }
    determine(int a1,int a2){
         this(a1,a2,0,0,0);
    }
    determine(int a1,int a2,int a3){
         this(a1,a2,a3,0,0);
    }
    determine(int a1,int a2,int a3,int a4){
         this(a1,a2,a3,a4,0);
    }                
    determine(int a1,int a2,int a3,int a4,int a5){
            this.a1 = a1;
            this.a2 = a2;
            this.a3 = a3 ;          
            this.a4 = a4;            
            this.a5 = a5;            
            
    }
    
    void print_min(){
   System.out.println(Math.min(a1,Math.min(a2,Math.min(a3,Math.min(a4,a5)))));
    }
     void print_max(){
     System.out.println(Math.max(a1,Math.max(a2,Math.max(a3,Math.max(a4,a5)))));

    }
}
