package October.ex_22102024_Loops;
public class Task3_For_Loops_Palindrome {
    public static void main(String[] args) {

        //Palindrome of String_ex1
        String str = "ABCDCBA";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--){
            rev += str.charAt(i);
        }

        if(str.equals(rev)){  //  To compare the content of str and rev
            System.out.println("Given string is palindrome");
        }
        else {
            System.out.println("Not a palindrome string.");
        }
    }
}
