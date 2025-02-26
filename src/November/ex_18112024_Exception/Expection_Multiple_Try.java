package November.ex_18112024_Exception;

public class Expection_Multiple_Try {
    public static void main(Strings[] args) {

        System.out.println("Start of program..");
        int b = 0;

        try {
            Strings ip = args[0];    //from edit configuration - value 100
            int a = Integer.parseInt(ip.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        int a1 = 0;
        try {
            String ip = null;
            a1 = Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
        System.out.println("End of program..");
    }
}
