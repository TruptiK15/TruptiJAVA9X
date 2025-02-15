package October.ex_21102024_Loops;

public class Loops_For_ex11_even_no {
    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - Even");
                //print all even nos
            }else {
                System.out.println(i + " - Odd");
                //print all odd nos
            }
        }
    }
}
