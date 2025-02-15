package October.ex_14102024_Type_casting;

public class Operator_Type_Casting {
    public static void main(String[] args) {

        // Type Casting -- changing variable from one datatype to another datatype
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit (not possible), Explicit - (with data type) loss

        //Widening - Converting lower data type to higher data type (safe conversion)
        byte b = 10;
        int a = b;          // Valid - Implicit Casting - automatically done by JVM
        int a1 = (int)b;    // Valid - Explicit Casting - automatically done by JVM
        System.out.println(a1);

        // Narrowing - Converting higher data type to lower datatype (data loss)
        int val = 200;
        //byte val1 = val;          // Invalid - Implicit Casting - not possible
        byte val2 = (byte)val;      // invalid - Explicit Casting - automatically done by JVM
        System.out.println(val2);
    }
}