class Fruit{

    private int price;
    private String name;
    
    Fruit(int price,String name){
     this.price = price;
     this.name = name;
     }
     
   Fruit(Fruit fruits){
    price = fruits.price;
    name = fruits.name;
    }
    
    int price(){
    return price;
    }
    
    String name(){
    return name;
    }
    
    
    public static void main(String args[]){
        Fruit fObj1 = new Fruit(299,"Apple");
        
        Fruit fObj2 = new Fruit(fObj1);
        System.out.println(fObj2.price());
        System.out.println(fObj2.name());
        }
        
   }
