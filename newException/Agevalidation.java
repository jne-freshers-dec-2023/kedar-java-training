package newException;

public class Agevalidation {
    public static void main(String[] args) {
        try {
            validation(10);
        }
        catch (CustomeExe exe){
            System.out.println("Age smaller " + exe.getMessage());
        }
    }


    static void validation(int age) throws CustomeExe{
        if (age < 18){
            throw new CustomeExe("Invalid Age");
        }else {
            System.out.println("Valid Age");
        }
    }
}
