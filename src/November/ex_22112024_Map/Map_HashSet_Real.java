package November.ex_22112024_Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Map_HashSet_Real {
    public static void main(String[] args) {

        Map<String,Object> student1 = new HashMap();
        student1.put("id", 1);
        student1.put("name", "Trupti");
        student1.put("phone", 123456);
        student1.put("address", "11 street");
        System.out.println(student1);

        Map<String,Object> student2 = new HashMap();
        student2.put("id", 2);
        student2.put("name", "Karan");
        student2.put("phone", 654321);
        student2.put("address", "22 street");
        System.out.println(student2);

        Set books_read = new HashSet();
        books_read.add("Rich Dad Poor Dad");
        books_read.add("Spaiens");
        books_read.add("Secret");
        books_read.add("Eat the Frog");
        System.out.println(books_read);
    }
}
