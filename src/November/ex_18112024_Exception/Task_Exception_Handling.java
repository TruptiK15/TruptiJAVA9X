package November.ex_18112024_Exception;

public class Task_Exception_Handling {
    public static void main(Strings[] args) {

        try {
            // Handling ArrayIndexOutOfBoundsException
            String s1 = "Pramod";
            Strings s2 = args[0];
            System.out.println("Command-line argument: " + s2);

            // Handling ArithmeticException
            int a = 10 / 0;
            System.out.println("Result of division: " + a);

            // Handling NullPointerException
            s1 = null;
            System.out.println(s1.trim());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: No command-line argument provided.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to access a null object.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}
