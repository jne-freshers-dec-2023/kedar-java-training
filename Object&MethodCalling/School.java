class Student{
   
    private int id;
    private String name;
    
    Student(int id,String name){
    
    this.id = id;
    this.name = name;
     }
    
    public void setId(int id){
    this.id = id;
    }
    
    public void setName(String name){
    this.name = name;
    }
    
    @Override
    public String toString(){
      return "ID : " +id + "Name : " + name;
      }
 }
 
 public class School{
 
      public static void main(String args[]){
        
         final Student student = new Student(1,"John");
         Student student1 = student;
         System.out.println(student1.toString());
         student1.setId(11);
         student1.setName("Kedar");
        System.out.println(student1.toString());
         }
 }
    
