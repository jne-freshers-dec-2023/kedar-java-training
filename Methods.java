
 class details{
    public void getName(){
        System.out.println("Name : Kedar"  );
    }

    public String getAddress(){
        return "Pandharpur";
    }
}

public class Methods {
    public static void main(String[] args) {

        details obj = new details();
        obj.getName();
        String address = obj.getAddress();
        System.out.println("Address : " +address);
    }
}
