package November.ex_15112024_Exception;

public class Exception_ex1_problem {

    public static void main(String[] args) {

        System.out.println("Start of program..");
        String ip = args[0];    //from edit configuration - value 100
        int a = Integer.parseInt(ip);
        int b = 1000 / a;
        System.out.println(b);
        System.out.println("End of program..");

        //if not handle then JVM will terminate the progran

        // 1. If argument are not pass - ArrayIndexOutOfBoundsException will occur
        // 2. if args is 0 - ArithmeticException will occur
        // 3. if args are String text - NumberFormatException will occur
    }
}
