package November.ex_21112024_Collection_Set;

import java.util.HashSet;
import java.util.Set;

public class Set_HashSet {
    public static void main(String[] args) {
        /* HashSet - use hashing mechanism
            - order is not allowed
            - duplicate not allowed
        */
        Set s1 = new HashSet();
        s1.add("Apple");
        s1.add("Orange");
        s1.add("WaterMelon");
        s1.add("WaterMelon");
        s1.add(null);
        System.out.println(s1);

    }
}
