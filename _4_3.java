import java.util.*;

class _4_3{
        public static void main(String [] args){
          Scanner sc = new Scanner(System.in);
          Monster f= new FireMonster();
          System.out.println(f.attack());
          Monster w = new WaterMonster();
          System.out.println(w.attack());
          Monster s = new StoneMonster();
          System.out.println(s.attack());                                                                   
}
}

class Monster{
     String name;
     String attack(){
       return "Monster is attacking";
     }
}

class FireMonster extends Monster{
    String attack(){
       return "FireMonster is attacking";
    }
}
class WaterMonster extends Monster{
    String attack(){
       return "WaterMonster is attacking";
    }
}
class StoneMonster extends Monster{
    String attack(){
       return "StoneMonster is attacking";
    }
}
