import java.util.*;
class Dog{
   public String name,color,breed,type;
   public double height;
   
   Dog(){
      this("","","","",0);
   
   }   
   Dog(String name,String color,String breed,String type,double height){
       this.name = name;
       this.color = color;
       this.breed = breed;
       this.type = type;
       this.height = height;
   }
   
   String getBreed(){
      return this.breed;
   }
   String getName(){
      return this.name;
   }
   String getColor(){
      return this.color;   
   }
   String getType(){
      return this.type;   
   }
   double getHeight(){
      return this.height;   
   }
   
   boolean compare(Dog other){
        boolean res = true;
        if(other.name.equals("none"));
        else{
             res = res && (other.name.equals(this.name));
        }
        if(other.color.equals("none"));
        else{
             res = res && (other.color.equals(this.color));
        }
        if(other.type.equals("none"));
        else{
             res = res && (other.type.equals(this.type));
        }
        if(other.breed.equals("none"));
        else{
             res = res && (other.breed.equals(this.breed));
        }
        if(other.height == -1.0);
        else{
             res = res && (other.height == this.height);
        }
        
        return res;                                
   }
   
   static ArrayList<Dog> getDogs(Dog preferred,Dog [] available){
          ArrayList<Dog> present = new ArrayList<Dog> ();
          int n = available.length;
          for(int i = 0;i<n;i++){
               if(available[i].compare(preferred)){
                   present.add(available[i]);
               }
          }
          return present;
   }
   
   static void find(Dog [] available){
      Scanner sc = new Scanner(System.in);
      double height = -1.0;
      String name = "none";
      String color = "none";
      String breed = "none";
      String type = "none";
      
      System.out.println("enter your preference of color of the dog , if you dont want have preference on color enter -->none");
      color = sc.next();
      color.toLowerCase();
      System.out.println("enter your preference of breed of the dog , if you dont want have preference on breed enter -->none");
      breed = sc.next(); 
      breed.toLowerCase();      
      System.out.println("enter your preference of type of the dog , if you dont want have preference on type enter -->none");
      type = sc.next();   
      type.toLowerCase();      
      System.out.println("enter your preference of height of the dog , if you dont want have preference on height enter -->-1");
      height = sc.nextDouble();   
      Dog preferred = new Dog(name,color,breed,type,height);
      ArrayList<Dog> found = getDogs(preferred,available);
      if(found.size() == 0){
      System.out.println("Sorry there is no match found for your preferences of dog");
      }else{
      System.out.println("Available dogs of your choices are : ");    
      for(Dog d:found){
      System.out.println(d.name);  
      }
      }        
   }

}


public class WEEK2_5{

    public static void main(String [] args){
          Dog [] array = new Dog[3];
          array[0] = new Dog("snoopy","white","pomerian","gaurd",1.0);
          array[1] = new Dog("rocky","brown","lab","sniffer",3.0);
          array[2] = new Dog("snowy","black"," g.sheperd","sheperd",4.0);                    
          Dog.find(array);
    }


}
