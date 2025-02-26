package November.ex_15112024_Wrapper;

public class Wrapper_ex2 {
    public static void main(String[] args) {

        //Conversions
        String no = "10";

        // Convert String to --> to Wrapper --> to Primitive datatype
        Integer num = Integer.valueOf(no);
        int a1 = num;
        System.out.println(a1);

        // Convert String to Primitive datatype - direct conversion
        int a2 = Integer.parseInt(no);
        System.out.println(a2);

        //Convert Wrapper to String
        Integer a3 = 100;
        String num1 = Integer.toString(a3);
        System.out.println(num1);
    }
}
