class TV{
  // 1 to 40 channels
  // 0 to 100 volume
  private int channel,volumeLevel;
  private boolean on;
  
  public TV(){
     channel = 1;
     volumeLevel = 30;
     on = false;
  }
  
  void turnOn(){
     on  = true;
     channel = 1;
     volumeLevel = 30;
  }
  void turnOff(){
     on = false;
  }
  
  boolean setChannel(int channel){
     if(on == false)return false;  
       if(channel > 0 && channel < 41)this.channel = channel;
       else return false;
       return true;
  }
  boolean setVolume(int volume){
     if(on == false)return false;  
       if(volume >= 0 && volume <= 100)this.volumeLevel = volume;
       else return false;
       return true;
  }
  
  void channelUp(){
     if(on == false)return;
     channel++;
     if(channel > 40)channel = 1;
  }
  void channelDown(){
     if(on == false)return;  
     channel--;
     if(channel < 1)channel = 40;
  }
  
  boolean volumeUp(){
     if(on == false)return false;  
     if(volumeLevel == 100)return false;
     ++volumeLevel;
     return true;
  }
  boolean volumeDown(){
     if(on == false)return false;  
     if(volumeLevel == 0)return false;
     --volumeLevel;
     return true;
  }  
    int getChannel(){
     if(on == false)return -1;    
     return channel; 
   }
   
   int getVolumeLevel(){
     if(on == false)return -1;   
     return volumeLevel;
   }
   
   boolean getTvStatus(){  
       return on;
   }
}





public class WEEK2_3{

   public static void main(String [] args){
       TV tv1 = new TV();
       tv1.turnOn();
       System.out.println(tv1.getChannel());
       System.out.println(tv1.getVolumeLevel());    
       tv1.setChannel(31);
       tv1.setVolume(100);
       System.out.println(tv1.getChannel());
       System.out.println(tv1.getVolumeLevel());              
       
   }

}
