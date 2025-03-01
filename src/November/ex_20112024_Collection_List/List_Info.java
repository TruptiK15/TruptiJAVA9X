package November.ex_20112024_Collection_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Info {
    //Linkedlist
    public static void main(String[] args) {

        List mylist = new ArrayList();      //Array Format - continous
        List mylist2 = new LinkedList();    //Doubly Linked List

        List fruits = List.of("Apple", "Orange", "Mango");
        //fruits.add("Watermelon");   //cannot add - unsupported
        System.out.println(fruits);

        /*
        1. ArrayList - continous
            - Searching - find element is easy
            - insert and deletion is not easy
            - insert / delete - heavy operation
            - allows duplicate
            -  widely used in concrete class

        2. LinkedList -
            - Searching - find element is hard
            - insert and delete of element is easy
            - insert / delete - easy operation

        3. Vector -
            - legacy class
            - store using index
            - methods are synchronized (1 by 1)
         */
    }
}
