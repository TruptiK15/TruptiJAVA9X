package October.ex_23102024_Function;

public class Function_Built_In {
    public static void main(String[] args) {

        /*Functions
        - Built In-Functions
        - User Defined Functions

        // Built-In Functions
        - String --> .length, .toLowerCase(), .CharAt(), .Trim(), .Split()
        - Math --> max, min, avg, cos, sin
        - StringBuffer --> reverse(), trim(), parseInt(),
        */

        int result = Math.max(4,10);    //Ternary Operator used internally
        System.out.println("Maximum -->" + result);

        int result1 = Math.min(4,10);
        System.out.println("Minimum -->" + result1);

        int result2 = Math.multiplyExact(4,10);
        System.out.println(result2);
    }
}
