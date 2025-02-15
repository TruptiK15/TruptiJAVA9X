package October.ex_21102024_Loops;

public class Loops_For_ex12_continue {
    public static void main(String[] args) {

        //Continue and for Loop
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;   //skip below code i.e., 5 and move to top
                //5 will be never executed
            } else {
                System.out.println(i);
            }
        }
    }
}
