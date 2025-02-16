package October.ex_23102024_Function;

public class Function_User_WP_WRT {
    public static void main(String[] args) {

        // With Parameters and with return type
        int sum = sum_of_no(4,10);
        System.out.println("sum : " + sum);
    }

    // With Parameters and with return type
    static int sum_of_no(int a, int b) {
        System.out.println("no1 : " + a + " \nno2 : " + b);
        return a + b;
        //int so we have a return type
        //and we have to pass parameter
    }
}
