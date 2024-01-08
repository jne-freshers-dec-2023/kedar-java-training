public class MethodOverloading{

    public static void main(String args[]){
    
      MethodOverloading methodoverloading = new MethodOverloading();
      methodoverloading.add(8,9);
      methodoverloading.add(10.5,74.5);
      methodoverloading.add(4,2,8);
    }
    
    public void add(int variableOne, int variableTwo){
    
      int finalResult = variableOne + variableTwo;
      System.out.println(finalResult);
      }
      
      public void add(double variableOne, double variableTwo){
      
      double finalResult = variableOne + variableOne;
      System.out.println(finalResult);
      }
      
     public void add(int variableOne, int variableTwo, int variableThree){
     
     int finalResult = variableOne + variableTwo + variableThree;
     System.out.println(finalResult);
     
     }
  }	
