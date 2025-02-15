package October.ex_11102024_Operator;

public class Operator_Logical {
    public static void main(String[] args) {

        /* 1. Logical Operator
                && AND   - Either 1 should be true --> true else false
                || OR    - both should be true --> true else false
                ! NOT
        */
        boolean a = true;
        boolean b = true;
        boolean c = true || false;
        System.out.println(c);
        System.out.println(!a);
        System.out.println(!b);
        System.out.println(!!b);
        System.out.println(!(10 > 20));     //true -->ans is false but as NOT so its true

    }
}
