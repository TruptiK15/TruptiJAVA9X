package November.ex_21112024_Collection_Set;

import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet {
    public static void main(String[] args) {
        /* TreeSet - store the element in sorted order
            - Black and red Tree mechanism to store the element
            - order is maintain - alphabetical order
            - duplicate not allowed
            - null not allowed
            - different datatype not allowed
        */
        Set s1 = new TreeSet();
        s1.add("WaterMelon");
        s1.add("Apple");
        s1.add("Orange");
        s1.add("WaterMelon");
        //s1.add(null)    // null not allowed
        //s1.add(123);    // different datatype not allowed
        System.out.println(s1);

        for (Object o : s1){
            System.out.println(o);
        }
    }
}
