
class Lamp{

private boolean isOn;
private String lampType;
   Lamp(boolean isOn,String lampType){
      this.isOn = isOn;
      this.lampType = lampType;
       System.out.println(isOn?lampType + " Lamp is on":lampType + " Lamp is off");
   }
   
   Lamp(){
     this.isOn = false;
     this.lampType = "unknown";
   }
   Lamp(boolean isOn){
     this(isOn,"unknown");
   }
   
   void turnOn(){
       isOn = true;
       System.out.println(lampType + "Lamp is turned on") ;      
   }
   void turnOff(){
       isOn = false;
       System.out.println(lampType + "Lamp is turned on") ;        
   }
   
   void getStatus(){
       System.out.println(isOn?lampType + " Lamp is on":lampType + " Lamp is off");
   }
   
   void changeStatus(){
       if(isOn)isOn = false;
       else isOn = true;
       System.out.println(isOn?lampType + " Lamp is on":lampType + " Lamp is off");       
   }
   
   String getLampType(){
      return lampType;
   }


}






public class WEEK2_2{

   public static void main(String [] args){
       Lamp a[] = new Lamp[2];
       a[0] = new Lamp(false,"LED");
       a[1] = new Lamp(false,"HALOGEN");     
       int ind = -1;  
       while(true){
       System.out.println("Enter LED for selecting LED lamp ");
       System.out.println("Enter HALOGEN for selecting HALOGEN lamp ");      
       System.out.println("Enter on for onning the lamp ");   
       System.out.println("Enter off for offing the lamp ");
       System.out.println("Enter status for knowing the status of the lamp "); 
       System.out.println("Enter change for changing the status of lamp "); 
       System.out.println("Enter exit for exiting the program ");       
       System.out.println("If u enter anything else or operate without selecting a lamp the program will auto matically exit for you");                                       
       
       
       }
   }

}
