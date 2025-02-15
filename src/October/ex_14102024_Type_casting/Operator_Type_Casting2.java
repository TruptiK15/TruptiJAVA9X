package October.ex_14102024_Type_casting;

public class Operator_Type_Casting2 {
    public static void main(String[] args) {

        long no = 1234567890;
        //short sh = no;          // Invalid - Implicit Casting
        short sh = (short)no;    // Explicit Casting - data loss
        System.out.println(sh);
    }
}