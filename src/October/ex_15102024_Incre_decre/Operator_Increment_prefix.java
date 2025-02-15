package October.ex_15102024_Incre_decre;

public class Operator_Increment_prefix {

    //Increment Operator
        //prefix Increment - ++variable - value is incremented first and then store in result
        //postfix Increment - variable++ - value is stored and then incremented

    public static void main(String[] args) {

        int a = 10;
        int b = ++a;    //a changed to 11
        System.out.println(a);
        System.out.println(b);
    }
}
