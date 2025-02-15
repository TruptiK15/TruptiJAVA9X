package October.ex_17102024_Condition;

public class Condition_if_else_example3 {
    public static void main(String[] args) {

        boolean a = true;
        a = !a;
        if (2 + 2 < 4) {
            System.out.println("Inside the loop.." + a);
        } else {
            System.out.println("Outside the loop.." + a);
        }
    }
}
