package October.ex_10102024_Constant_literals;

public class Task1010_Types_of_literal {
    public static void main(String[] args) {

        //Task 1. Find all the types of the literals supported by the Java.
        /*
        1. Integral Literals
        2. Decimal Integer -
        3. Octal Integer -
        4. Hexa-Decimal -
        5. Binary Integer: */

        //Task 2: with example
        int Decimal_Literal = 1234;     //digits from 0 to 9 - Example: 2022, +42, -68.
        int Octal_Literal =  01234;     //digits from 0 to 7 - Begins with 0 - Example: 007, 0295.
        int Hexa_Literal = 0xABCD123;   //digits from 0 to 9 and the characters A to F - Example: 0xf, 0xe.
        int Binary_Literal = 0b010101;  //digits 8 contains - “0” and “1. - Prefix 0b Example: 0b11011*/

        // Floating and double Literals
        float floatVal = 123.99f;       //single precision (4 bytes) end with an “f” or “F.” Example: 4f.
        double doubleVal = 323433.14234; //double precision (8 bytes) end with a “d” or “D.” Example: 3.14d.

        //Char Literals -
        // expressed as an escape sequence or a character,
        // Unicode characters ranging from 0 to 65535. Example: char ch = 077.
        char c = 'M';  // literals in single quotation
        char D = 062;  // char literal as integral literal
        char AA = '\u0061';  // as unicode representation u0061 is present a.
        char BB = '\n';    // Escape Sequence

        //String_ex1 Literals double quote ("") marks. These characters can be alphanumeric,
        // special characters, blank spaces, etc.
        String G = "Learning Java";
        String GG = "123AAA";
        String CC = "#$%";
        String KK =   "  Test";
        String LL = "\n";

        // Boolean Literals - Boolean literals represent the logical value of either true or false.
        boolean NN = true;
        boolean MM = false;

        //Null Literals - Null literals represent a null value
        String Name = "null";

        System.out.println(Decimal_Literal);
        System.out.println(Octal_Literal);
        System.out.println(Hexa_Literal);
        System.out.println(Binary_Literal);
        System.out.println(floatVal);
        System.out.println(doubleVal);
        System.out.println(c);
        System.out.println(D);
        System.out.println(AA);
        System.out.println(BB);
        System.out.println(G);
        System.out.println(GG);
        System.out.println(CC);
        System.out.println(KK);
        System.out.println(LL);
        System.out.println(NN);
        System.out.println(MM);
        System.out.println(Name);

    }
}
