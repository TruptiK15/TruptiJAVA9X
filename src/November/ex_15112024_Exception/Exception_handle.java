package November.ex_15112024_Exception;

import java.lang.Exception;

public class Exception_handle {
    public static void main(String[] args) {

        int c = 0;
        int b = 0;
        try {
            b = 10 / c;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
