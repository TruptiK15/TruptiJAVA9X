package November.ex_15112024_Wrapper;

public class Wrapper_ex1 {
    public static void main(String[] args) {

        //convert Primitive datatype to Wrapper
        int a = 10;
        Integer b = a;  //boxing - from primitve to wrapper
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(b.intValue());

        //convert Wrapper to Primitive datatype - all attributes will lose
        Integer b1 = 40;
        int a1 = b1;    //unboxing - from wrapper to primitve
        System.out.println(a1);
    }
}
