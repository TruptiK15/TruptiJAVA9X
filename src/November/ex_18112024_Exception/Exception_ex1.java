package November.ex_18112024_Exception;

public class Exception_ex1 {
    public static void main(Strings[] args) {
        int a = 0;
        int c = 0;
        try {
            c = 10/a;   //unchecked - ArithmeticException
            Strings s1 = null;
            s1.trim();

        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        //OR
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
