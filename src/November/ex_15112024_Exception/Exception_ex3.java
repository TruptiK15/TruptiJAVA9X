package November.ex_15112024_Exception;

import java.lang.Exception;

public class Exception_ex3 {
    public static void main(String[] args) {

        System.out.println("Start");
        String s1 = null;
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Can't do trim for null");   //custom message
        }
        System.out.println("End");
        //Unchecked - throws NullPointerException
        //handle it by try and catch
        //select the s1.trim and click surround --> try and catch
    }
}
