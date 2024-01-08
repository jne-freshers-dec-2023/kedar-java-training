        
class Animal{
   
   void sound(){
   System.out.println("Making Noise");
   }
}
   
class Dog extends Animal{
   
     void breed(){
     System.out.println("Golden Retriver");
     }
}
     
class Cat extends Animal{
     
     void quality(){
     System.out.println("Good Jump");
     }
}
     
public class Inheritance{
        
        public static void main(String args[]){
        
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.breed();
        dog.sound();
        cat.quality();
        }
}
