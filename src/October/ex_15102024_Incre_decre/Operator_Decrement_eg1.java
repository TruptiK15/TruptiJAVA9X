package October.ex_15102024_Incre_decre;

public class Operator_Decrement_eg1 {

    //Decrement Operator
        //prefix decrement --> --variable --> value is decremented first and then store in result
        //postfix decrement --> variable-- --> value is stored and then decremented

    public static void main(String[] args) {

        int a = 10;
        int result = --a;   //9
        System.out.println(a);  //displays actual value of a in a++ and then add a(11)
    }
}
