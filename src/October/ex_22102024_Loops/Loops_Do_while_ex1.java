package October.ex_22102024_Loops;

public class Loops_Do_while_ex1 {
    public static void main(String[] args) {

        int i = 0;
        do {
            System.out.println("Print --> " + i);
            i++;
        } while (i < 0);
        //it will print i = 0 and then check condition even if it is false
    }
}
