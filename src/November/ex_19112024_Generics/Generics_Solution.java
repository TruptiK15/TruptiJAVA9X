package November.ex_19112024_Generics;

public class Generics_Solution {

    public static void main(String[] args) {

        //Generic functions allows to support any datatype
        //T is just a reference (name) - can be anyting
        temp_sum(20, 5);
        temp_sum("Trupti", "Keni");
        temp_sum(true, false);
    }

    public static <T> T temp_sum(T a, T b) {  //temporary function
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
