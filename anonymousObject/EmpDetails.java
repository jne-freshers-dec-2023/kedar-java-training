class Employee{
   
    private int id;
    private String name;
    
    Employee(int id, String name){
    
    this.id = id;
    this.name = name;
    }
    
    void display(){
    System.out.println("Id : " + id + "Name : "+ name);
    }
 }
 
 public class EmpDetails{
    
    public static void main(String args[]){
          
          new Employee(1,"John").display();
          
          }
          }
