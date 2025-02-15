package October.ex_10102024_Constant_literals;

public class Character_literal {
    public static void main(String[] args) {

        char c1 = 'A';
        char c2 = 'b';
        char c3 = '@';

        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';     //delete last word
        char car_r = '\r';      //delete word

        System.out.println("Press" + new_line + "Line");
        System.out.println("Press" + tab_line + "Line");
        System.out.println("Press" + back_space + "Line");
        System.out.println("Press" + car_r + "Line");

        char c11 = '\u1F60';
        //ASCII
        char A = '\u0041';      //Ascii - 65      //unicode - \u0041
    }
}
