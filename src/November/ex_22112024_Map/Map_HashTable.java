package November.ex_22112024_Map;
import java.util.Enumeration;
import java.util.Hashtable;
public class Map_HashTable {
    public static void main(String[] args) {

        /* HashTable -
        - synchorized, slow and legacy class
        - T1, T2 - they will use one by one
        - null value & key are not allowed
        */

        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "one");
        ht.put(2, "two");
        ht.put(3, "three");
        ht.put(4, "four");
        System.out.println(ht);

        //for legacy class - we use enumeration
        Enumeration em1 = ht.keys();
        while(em1.hasMoreElements()){
            System.out.println(em1.nextElement());
        }
    }

}
