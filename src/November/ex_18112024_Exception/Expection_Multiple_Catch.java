package November.ex_18112024_Exception;

public class Expection_Multiple_Catch {
    public static void main(Strings[] args) {

        System.out.println("Start of program..");
        Strings ip = args[0];    //from edit configuration - value 100
        int a = Integer.parseInt(ip.toString());
        int b = 0;
        try {
            b = 1000 / a;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
        System.out.println("End of program..");
    }
}
