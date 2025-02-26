package November.ex_18112024_Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception_Uncheck_checked_example {
    public static void main(Strings[] args) {

        //Unchecked - ArithmeticException
        try {
            int a = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Unchecked Exception");
        }

        //Checked - FileNotFoundException
        try {
            FileInputStream f1 = new FileInputStream(new File("c://a.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Checked Exception");
        }
    }
}
