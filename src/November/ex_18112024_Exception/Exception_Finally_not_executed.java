package November.ex_18112024_Exception;

public class Exception_Finally_not_executed {
    public static void main(String[] args) {

        try {
            int a = 10/5;
            System.exit(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finally not executed");
        }
    }
}
