package October.ex_14102024_Type_casting;

public class Operator_Type_Casting3 {
    public static void main(String[] args) {

        //GST = 18.55
        int course = 100;
        float GST = 18.55f;
        int total_price = course + (int) GST;   //Narrowing - Explicit
        System.out.println(total_price);

        float total_price1 = course + GST;
        System.out.println(total_price1);
    }
}