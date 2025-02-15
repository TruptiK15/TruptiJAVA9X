package October.ex_21102024_Loops;

public class Loops_For_ex12_break {
    public static void main(String[] args) {

        //Break and for Loop
        for (int i = 0; i < 50; i++) {
            if (i == 5) {
                System.out.println("Five");
                break;
            } else {
                System.out.println(i);
            }
        }
    }
}
