package November.ex_18112024_Exception;

public class Exception_ex5 {
    public static void main(Strings[] args) {

        final double pi = 3.14;
        int a = 0;
        try {
            // Handling ArithmeticException if divide by 0
            int b = 10 / a;
        } catch (Exception e) {
            System.out.println("divide by zero");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End of Program.");
        }
    }
}
