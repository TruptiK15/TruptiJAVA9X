package October.ex_25102024_String;

public class String_Equal {
    public static void main(String [] args) {

        //1 SCP , 3 OA created
        //present in String constant pool SCP
        // Creates or reuses "Hello" in the String pool
        // Reuses the "Hello" from the String pool
        String s1 = "Hello";
        String s2 = "Hello";

        //present in object Area - OA
        // Creates a new object on the heap
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = new String("Hello");

        System.out.println(s1 == s2);   //true  - In same SCP (
        // true, both refer to the same object in the pool

        System.out.println(s1 == s3);   //false - different SCP & OA
        // false, str3 is a new object in the heap

        System.out.println(s4 == s3);   //false - everyone is different in OA
        // true, because the content is the same

        // == --> comparison (check ref location)
        //.equals - check contents value
        System.out.println(s1.equals(s3));  //true
        System.out.println(s3.equals(s4));  //true

        //commonly used String class
        // length() - total char length
        // toUpperCase()
        // .equals() - content
        // .equalsIgnore - content with ignore case
    }
}
