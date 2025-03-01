package November.ex_21112024_Collection_LinkedList;
import java.util.LinkedList;
import java.util.List;
public class LinkedList_ex1 {
    /* ------- 2. LinkedList ----------
        - doubly-linked data structure
        - Searching - find element is hard
        - insert / delete - easy operation
        - these are not index based (dublicates are allowed)
     */
    public static void main(String[] args) {
        //used in Selenium - to store the element where insert & deletion is used
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        System.out.println(list);

        /* If in API Testing
        - Store the elemnt & access it fast - use Araylist
        - Store the element & insert & delete it fast - use Linkedlist
        */
    }

}
