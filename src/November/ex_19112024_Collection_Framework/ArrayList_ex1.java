package November.ex_19112024_Collection_Framework;

import java.util.ArrayList;

public class ArrayList_ex1 {
    // ---- ArrayList -------
    // List - An ordered Collection (i.e., sequence)
    // dupicate is allowed
    // control over insertion
    public static void main(String[] args) {

        //Collection list2 = new ArrayList();   //Dyanmic Dispatch
        //List list3 = new ArrayList();   //Dyanmic Dispatch
        ArrayList list1 = new ArrayList();
        list1.add("Trupti");
        list1.add("Amey");
        list1.add("Amey");
        list1.add("Kiara");
        list1.add("Sneha");
        list1.add(true);
        list1.add(123);
        list1.add(null);
        System.out.println(list1);
    }
}
