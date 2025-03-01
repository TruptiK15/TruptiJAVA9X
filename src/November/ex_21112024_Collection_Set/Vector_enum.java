package November.ex_21112024_Collection_Set;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_enum {
    public static void main(String[] args) {

        Vector<String> v1 = new Vector<>();
        v1.add("Apple");
        v1.add("Banana");
        v1.add("Orange");
        v1.add("Papaya");
        System.out.println(v1);

        System.out.println("------For each--------");
        for (String o : v1){
            System.out.println(o);
        }

        System.out.println("------Enumeration--------");
        Enumeration<String> enum1 = v1.elements();
        while(enum1.hasMoreElements()){
            System.out.println(enum1.nextElement());
        }
    }
}
