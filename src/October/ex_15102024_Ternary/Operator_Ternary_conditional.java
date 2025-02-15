package October.ex_15102024_Ternary;

public class Operator_Ternary_conditional {
    public static void main(String[] args) {

        // Conditional operator known as Ternary Operator
        //Syntax --> result = condition ? expression1 : expression2
            //condition - boolean expression
            //expression1 - if condition is true
            //expression2 - if condition is true

        int no = -5;
        String result = no > 0 ? "Positive" : "Negative" ;
        System.out.println("no --> " + no + " is " + result);
    }
}
