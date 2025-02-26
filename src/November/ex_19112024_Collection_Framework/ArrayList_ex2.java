package November.ex_19112024_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_ex2 {

    public static void main(String[] args) {

        List list1 = new ArrayList();
        list1.add("1");     //0
        list1.add("2");     //1
        list1.add("3");     //2
        list1.add("4");     //3
        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println(list1.isEmpty());
        System.out.println(list1.contains("2"));
        System.out.println(list1.indexOf("3"));

    }
}
