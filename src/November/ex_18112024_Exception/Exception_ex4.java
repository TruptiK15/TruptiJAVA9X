package November.ex_18112024_Exception;

public class Exception_ex4 {
    public static void main(Strings[] args) {

        try {
            // Handling ArrayIndexOutOfBoundsException - if args not pass
            Strings s1 = "Pramod";
            Strings s2 = args[0];

            // Handling ArithmeticException if divide by 0
            int a = 10 / 2;
            System.out.println("Result of division: " + a);

            // Handling NullPointerException
            s1 = null;
            System.out.println(s1.trim());

        } catch (Exception e) {
            System.out.println("There is some problem with the code : ");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End of Program.");
        }
    }
}
