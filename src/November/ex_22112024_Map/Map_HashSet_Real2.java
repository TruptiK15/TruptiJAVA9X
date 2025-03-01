package November.ex_22112024_Map;

import java.util.*;

public class Map_HashSet_Real2 {
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

        List list = new ArrayList();
        list.add(student1);
        list.add(student2);
        System.out.println(list);
        // {} - Map
        // [] - ArrayList
    }
}
