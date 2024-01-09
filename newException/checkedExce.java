package newException;

import java.io.FileInputStream;

public class checkedExce {

    public static void main(String[] args) {
        try {
            Class.forName("create.txt");
            System.out.println("File found");
        }
        catch (Exception e){
            System.out.println("No such file " + e.getMessage());
        }
    }
}
