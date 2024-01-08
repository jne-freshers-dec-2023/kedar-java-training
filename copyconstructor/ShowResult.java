final class DisplayInfo1{
   
    void display(){
        System.out.println("You are in DisplayInfo class");
        }
}

public class ShowResult{
       public static void main(String args[]){
         
          DisplayInfo1 displayInfo = new DisplayInfo1();
          DisplayInfo1 copyObj = displayInfo;
          
          copyObj.display();
          }
}
