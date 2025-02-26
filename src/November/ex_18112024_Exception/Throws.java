package November.ex_18112024_Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws {
    public static void main(Strings[] args) throws FileNotFoundException {

        //Throws - when we have checked example
        FileInputStream f1 = new FileInputStream(new File("c://a.txt"));
    }
}
