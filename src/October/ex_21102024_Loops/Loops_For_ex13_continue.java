package October.ex_21102024_Loops;

public class Loops_For_ex13_continue {
    public static void main(String[] args) {

        //Continue and for Loop
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even --> " + i);
                continue;
                //skip below code and move to top
            } else {
                System.out.println(i);
            }
        }
    }
}
