package November.ex_20112024_Collection_List;

import java.util.ArrayList;
import java.util.List;

public class Nested_ArrayList {
    public static void main(String[] args) {

        List list1 = new ArrayList();
        list1.add("Orange");
        list1.add("Mango");
        list1.add("Apple");
        list1.add("Guava");
        System.out.println(list1);

        List list2 = new ArrayList();
        list2.add("Mango");
        list2.add("Pineapple");
        list2.add("cherry");
        list2.add("Orange");
        System.out.println(list2);

        List list3 = new ArrayList();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        System.out.println(list3);
        System.out.println("---------------------");

        List allfruits = new ArrayList();
        allfruits.add(list1);
        allfruits.add(list2);
        allfruits.add(list3);
        System.out.println(allfruits);
        //list within list
    }
}
