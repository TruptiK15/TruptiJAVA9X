package October.ex_28102024_String;

public class String_Functions {
    public static void main(String[] args) {

        //CharAt - returns char at index
        String s1 = "Trupti";
        char s2 = s1.charAt(0);
        //char s3 = s1.charAt(10);    //StringindexOutOfBoundsException
        System.out.println(s2);

        //Trim()
        String a1 = " Hi ";
        System.out.println(a1.trim());

        //IndexOf
        String m1 = "Automation";
        System.out.println(m1.indexOf("u"));
        System.out.println(m1.indexOf("n"));

        //Contains
        String n1 = "Automation";
        System.out.println(n1.contains("Auto"));

        //lastindexof
        String n2 = "Automation";
        System.out.println(n2.indexOf("t"));
        System.out.println(n2.lastIndexOf("t"));

        //replace
        String n3 = "Automation";
        System.out.println(n3.replace("t","z"));

        //Starts-with & ends-with
        String n4 = "Automation";
        System.out.println(n4.startsWith("Aut"));
        System.out.println(n4.endsWith("tion"));
        System.out.println(n4.endsWith("ma"));
    }
}
