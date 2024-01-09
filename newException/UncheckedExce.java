package newException;

public class UncheckedExce {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int c = a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("Arithmatic Exception "+ e.getMessage());
        }catch ( Exception e){
            System.out.println("cannot divide by zero " + e.getMessage());
        }

    }

}
