package October.ex_21102024_Loops;

public class Loops_For_ex5 {
    public static void main(String[] args) {

        final boolean b1 = true;
        for (int i = 0; b1; i++) {
            //b1 - condition is always true
            //will execute infinite loop
            System.out.println("Helloo........");
        }

        /* for(; ;) {
            //no condition
            //will execute infinite loop
            System.out.println("Helloo........");
        }
       */
    }
}
