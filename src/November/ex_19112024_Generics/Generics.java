package November.ex_19112024_Generics;

public class Generics {
    /*-------Generics-------
        - it allows developers tp create class, interface, and methods with type parameters
        - code reusablility (same function used for in the same is used for Strings)
     */
    public static void main(String[] args) {

        temp_sum(20, 5);
        temp_sum("Trupti", "Keni");
    }

    public static Integer temp_sum(Integer a, Integer b) {  //temporary function
        return a + b;
    }

    public static String temp_sum(String a, String b) {  //temporary function
        return a + b;
    }
}
