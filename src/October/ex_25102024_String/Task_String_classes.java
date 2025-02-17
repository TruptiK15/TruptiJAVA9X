package October.ex_25102024_String;

import java.util.Arrays;

public class Task_String_classes {
    public static void main(String [] args) {

        //practice
        String name = "Trupti";
        String fullname = "Trupti Keni";

        // 1. charAt();
        System.out.println(name.charAt(3));     //p

        // 2. concat()
        System.out.println(name.concat(" Keni"));   //Trupti Keni

        // 3. contains()
        System.out.println(fullname.contains("Keni"));  //true

        // 4. equals()
        System.out.println(name.equals("Trupti"));  //true

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("trupti")); //true

        // 6. indexOf()
        System.out.println(name.indexOf('u'));  //2

        // 7. length()
        System.out.println(name.length());  //6

        // 8. replace( , )
        System.out.println(name.replace('i','z'));  //Truptz

        // 9. split()
        String[] split = fullname.split(" ");
        System.out.println(Arrays.toString(split)); //[Trupti, Keni]
        System.out.println(split[0]);   //Trupti
        System.out.println(split[1]);   //keni

        // 10. substring( , )
        System.out.println(name.substring(1, 3));   //ru

        // 11. toLowerCase()
        System.out.println(name.toLowerCase());     //trupti

        // 12. toUpperCase()
        System.out.println(fullname.toUpperCase()); //TRUPTI KENI

        // 13. replaceAll()
        System.out.println(fullname.replaceAll(" ", " karan "));    //Trupti Karan keni

        // 14. startsWith()
        System.out.println(name.startsWith("T")); //true

        // 15. endsWith()
        System.out.println(name.endsWith("i")); //true

        // 16. isEmpty()
        System.out.println(name.isEmpty()); //false

        // 17. trim()
        String name3 = "    Trupti Karan     "; //Trupti Karan
        System.out.println(name3.trim());

        // 18. compareTo()
        System.out.println(name.compareTo("Trupti"));   //0

        // 19. compareToIgnoreCase()
        System.out.println(name.compareToIgnoreCase("Trupti")); //0

        // 20. lastIndexOf()
        System.out.println(name.lastIndexOf("i"));  //5

        // 21. repeat()
        System.out.println(name.repeat(2)); //TruptiTrupti

        StringBuilder stringBuilder = new StringBuilder("Trupti");
        stringBuilder.append("Keni");
        System.out.println(stringBuilder);  //TruptiKeni

        StringBuilder sb = new StringBuilder("Hi");
        sb.append(" It's my World!");
        System.out.println(sb.toString());  //Hi Its my World!

        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println("Concatinate : " + s3); // Output: Hello World!
    }
}
