package October.ex_14102024_Type_casting;

public class Operator_char_concatenation {

    public static void main(String[] args) {

        //Rule: concatenation of character is integer concatenation
        //character are ASCII values
        char a = 'A';       //65
        char b = 'B';       //66
        System.out.println(a+b);    //it will add as integer

        System.out.println('A' == 65);
    }
}
