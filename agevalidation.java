public class agevalidation {
    public static void main(String[] args) {
             try{
                 validateage(30);
             }
             catch (customException e){
                 System.out.println("Error :"+e.getMessage());
             }
    }

    public static void validateage(int age) throws customException {
        if (age < 18) {
            throw new customException("Age is under 18");
        }
        System.out.println("Valid :" + age);
    }
}