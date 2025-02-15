package October.ex_11102024_Operator;

public class Operator_Arithmetic {
    public static void main(String[] args) {

        /* 1. Arithmetic Operator
                + Additions
                - Subtraction
                * Multiplication
                / Division
                % Modulos       //divisible by (remainder)
        */

        int a = 20;
        int b = 10;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        a = 13; b = 4;
        System.out.println(a%b);

        //compound arithmetic
        //+=   -=  /=  *=
        int a1 = 10;
        a1 += 10;    //a1 = a1 + 10;
        System.out.println(a1);

        a1 -= 10;    //a1 = a1 - 10;
        System.out.println(a1);

        a1 /= 10;    //a1 = a1 / 10;
        System.out.println(a1);

        a1 *= 10;    //a1 = a1 * 10;
        System.out.println(a1);

    }
}
