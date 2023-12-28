import java.util.Scanner;

public class tryException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a Number");
            int number = Integer.valueOf(sc.nextLine());

            int result  = 10/number;
            System.out.println("Result :" + result);
        }
        catch (ArithmeticException e){
            System.out.println("Cannot Divide by zero");
        }
        catch (NumberFormatException e){
            System.out.println("Enter a valid Number");
        }
        finally {
            System.out.println("This will execute");
            sc.close();
        }
    }
}
