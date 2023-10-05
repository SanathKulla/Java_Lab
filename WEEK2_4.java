class Car{
   String company,color;
   double speed,double mileage;
   
   Car(String company,String color,double speed,double milege){
       this.company = company;
       this.color = color;
       this.speed = speed;
       this.mileage = mileage;
   }
   
   Car(){
      this("none","none",0,0);
   }
   
   double getMileage(){
     return mileage;
   }
   double getSpeed(){
      return speed;
   }
   boolean compare(Car other){
     // return true if other car is better
     if(other.company == "none")return false;
     return (other.speed > this.speed) || (other.getSpeed() == this.speed && other.getMileage() > this.mileage);
   }
}


public class WEEK2_4{
   public static void main(){
     
  }   

}
