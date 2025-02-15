package October.ex_15102024_Incre_decre;

public class Operator_Increment_eg1 {

    //Increment Operator
        //prefix Increment - ++variable - value is incremented first and then store in result
        //postfix Increment - variable++ - value is stored and then incremented

    public static void main(String[] args) {

        int a = 10;
        //System.out.println(a++);  //displays actual value of a in a++ and then add a(11)
        System.out.println(a++ + a);  //displays actual value of a in a++ and then add a(11)
    }
}
