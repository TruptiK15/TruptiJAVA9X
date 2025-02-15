package October.ex_21102024_Loops;
public class Loops_For {
    public static void main(String[] args) {
        /* Loops_For -
            Helps to repeat a block of code
            Syntax - Initialization; condition; updation (inc/dec) ICU
        */
        for (int i = 0; i < 10; i++) {              //i++ ++i --> no difference
            System.out.println(i);  //block of code
        }
        System.out.println("-----------------------");
        for (int i = 0; i < 10; ++i) {              //i++ ++i --> no difference
            System.out.println(i);  //block of code
        }
        System.out.println("-----------------------");
        for (int trupti = 1; trupti <= 10; trupti++) {
            System.out.println(trupti);  //block of code
        }
    }
}
