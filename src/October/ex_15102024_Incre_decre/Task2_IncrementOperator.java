package October.ex_15102024_Incre_decre;

public class Task2_IncrementOperator {
    public static void main(String[] args) {

        int a = 20;
        System.out.println(++a + a++ + a++);
        //++a   - 11
        //a++   - 11 + 1 - 12
        //a++   - 12 + 1 - 13
        // 11 + 12 + 13 = 36
        System.out.println(a);
    }
}
