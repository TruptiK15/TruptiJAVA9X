package October.ex_28102024_String;

public class String_Builder {
    public static void main(String[] args) {

        /* StringBuilder vs StringBuffer
         - disadvantages - immutable in nature
         - they are designed for string manipulation operation such as
                - appending
                - inserting
                - deleting of characters from string

         --> StringBuffer is Thread safe
        */
        StringBuffer stringbuffer = new StringBuffer("Karan");
        stringbuffer.append("Mangela");
        System.out.println(stringbuffer);
        stringbuffer.delete(0,4);
        System.out.println(stringbuffer);
        stringbuffer.reverse();
        System.out.println(stringbuffer);

        StringBuilder stringbuilder = new StringBuilder("Trupti");
        stringbuilder.append("Keni");
        System.out.println(stringbuilder);
    }
}
