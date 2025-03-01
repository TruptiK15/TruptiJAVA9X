package November.ex_20112024_Collection_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_ex1 {
/*--------- 1. ArrayList - continous - widely used in concrete class
            - Searching - find element is easy
            - insert and deletion is not easy
            - allows duplicate
 */
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("bread");      //0
        list.add("milk");       //1
        list.add("butter");     //2
        list.add("jam");        //3
        list.add("cheese");     //4
        list.add("paneer");     //5
        System.out.println(list);
        System.out.println(list.size());    //total 6 elements
        System.out.println(list.isEmpty());
        System.out.println(list.contains("milk"));

        //using for loop - print all elements 1 by 1
        System.out.println("------for Loop------");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        //using for each
        System.out.println("------for each------");
        for (Object o : list){
            System.out.println(o);
        }
        //using Iterator
        System.out.println("------Iterator------");
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
