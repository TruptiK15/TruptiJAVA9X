package October.ex_11102024_Operator;

public class Operator_Example1 {

    public static void main(String[] args) {

        String fname = "Trupti";
        String lname = "Keni";
        int a = 10;
        int b = 20;
        System.out.println(fname + lname + a + b);    //TruptiKeni1020 (concatination) - first is String
        System.out.println(a + b + fname + lname);    //30TruptiKeni --> First math then concatination
        System.out.println(fname + lname + (a + b));    //TruptiKeni30 --> Both

        //BODMAS
        //Brackets - Order - Division - Multiple - Add - Substract
    }
}
