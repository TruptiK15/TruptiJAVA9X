package November.ex_15112024_Exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.Exception;

public class Exception_ex2 {
    public static void main(String[] args) throws FileNotFoundException {

    /*
        1. Checked - JVM knows it
            - FileNotFoundException
            - ClassNotFoundException
            - IllegalAccessException
            - SQLException
            - IOException

        2. UnChecked - JVM doesn't knows it
            - ArithmeticException
            - NullPointerException
            - NegativeArraySizeException
            - ArrayIndexOutOfBoundsException
            - StringIndexOutOfBoundsException
    */
        //Checked Exception - throws FileNotFoundException
        //FileInputStream f1 = new FileInputStream("C://a.txt");
        //jvm tells as to handle it

        //Checked Exception - throws ArithmeticException
        int a = 10;
        int b = 0;
        try {
            b = a / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
