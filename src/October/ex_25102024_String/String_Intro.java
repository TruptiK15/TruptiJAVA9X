package October.ex_25102024_String;

public class String_Intro {
    public static void main(String [] args) {

        /* ---- String ----
            - Non-Primitive Datatyep
            - it is a Sequence of Characters
            - Built-In class (java.lang.String) package by Java
            - String a final class (cannot be inherited)

            Immutable - Why Strings are immutable?
            - Strings are constants , their value cannot be changed after created.
            - when we create String - it will be always present in memory

--------------------------------------------------------------------------
        How String are stored?
        - String Constant Pool
        - Heap area

        How String are represented?
        1. String Class
        2. String Buffer
        3. String Builder
        4. Array of characters (collection of char)
        5. ArrayList of characters
        */
        char ch = 'T';
        String name1 = "Trupti";
        System.out.println(name1);
        System.out.println(name1.length());
    }
}
