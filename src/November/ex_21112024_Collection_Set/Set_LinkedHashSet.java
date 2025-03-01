package November.ex_21112024_Collection_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_LinkedHashSet {
    public static void main(String[] args) {
        /* LinkedHashSet - use Linkedlist mechanism
            - order is maintain
            - duplicate not allowed
        */
        Set s1 = new LinkedHashSet();
        s1.add("Apple");
        s1.add("Orange");
        s1.add("WaterMelon");
        s1.add("WaterMelon");
        s1.add(null);
        System.out.println(s1);

    }
}
