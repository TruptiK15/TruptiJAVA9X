package October.ex_15102024_Incre_decre;

public class Task2_DecrementOperator {
    public static void main(String[] args) {

        int a = 20;
        System.out.println(--a + a++ + a--);
        //--a   - 19
        //a++   - 19 + 1 - 20
        //a--   - 20 - 1 - 19
        // 19 + 20 + 19 = 58
        System.out.println(a);
    }
}
