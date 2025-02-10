package October.ex_11102024;

public class Operator_Logical3 {
    public static void main(String[] args) {

        int a = 12;
        boolean b = !(a > 10 || a < 5);
        // ! (12 > 10 || 12 < 5)
        System.out.println(b);     //true -->ans is false but as NOT so its true

    }
}
