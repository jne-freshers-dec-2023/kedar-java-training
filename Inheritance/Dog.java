   public class Dog extends Animal{
                    public void sound(){
                    System.out.println("Make a Sound of Bark");
                    }
                    
                    public static void main(String args[]){
                     
                     Animal Obj1 = new Animal();
                     Animal Obj2 = new Dog();
                     Obj1.sound();
                     Obj2.sound();
                     }
                     } 
