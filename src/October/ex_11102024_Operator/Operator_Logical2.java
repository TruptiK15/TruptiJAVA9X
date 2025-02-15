package October.ex_11102024_Operator;

public class Operator_Logical2 {

    public static void main(String[] args) {

         /* 1. Logical Operator
                && AND   - Either 1 should be true --> true else false
                || OR    - both should be true --> true else false
                ! NOT
        */

        //AND GATE - &&
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        //OR GATE - !!
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
    }
}
