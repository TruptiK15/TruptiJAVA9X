package October.ex_28102024_String;

public class String_Replace_regex {
    public static void main(String[] args) {

        //replace
        String n3 = "banana";
        System.out.println(n3.replace("a","o"));

        //ReplaceAll
        String n1 = "Hello123 World456!";
        System.out.println(n1.replaceAll("\\d+"," "));
    }
}
