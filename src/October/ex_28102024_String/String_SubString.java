package October.ex_28102024_String;

public class String_SubString {
    public static void main(String[] args) {

        //SubString only shows the index values

        String str = "Trupti";
        String part_of_string = str.substring(4);   //after 4
        String whole_string = str.substring(1, 5);  //show from 1 and 5
        System.out.println(part_of_string);
        System.out.println(whole_string);

        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11,15);
        System.out.println(roar);
    }
}
