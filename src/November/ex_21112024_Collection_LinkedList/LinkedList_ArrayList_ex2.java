package November.ex_21112024_Collection_LinkedList;
import java.util.ArrayList;
import java.util.LinkedList;
public class LinkedList_ArrayList_ex2 {

    public static void main(String[] args) {

   /*   If in API Testing
        - Store the elemnt & access it fast - use Araylist
        - Store the element & insert & delete it fast - use Linkedlist
   */
        LinkedList l1 = new LinkedList();
        l1.add("Node 1");
        l1.add("Node 2");
        l1.add("Node 3");
        l1.add("Node 4");
        System.out.println(l1);

        ArrayList l2 = new ArrayList();
        l2.add("Node 1");
        l2.add("Node 2");
        l2.add("Node 3");
        l2.add("Node 4");
        System.out.println(l2);
    }

}
