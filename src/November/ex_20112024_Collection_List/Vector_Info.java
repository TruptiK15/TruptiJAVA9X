package November.ex_20112024_Collection_List;

import java.util.Vector;

public class Vector_Info {
    public static void main(String[] args) {

        /* - Vector
            - legacy class
            - store using index
            - methods are synchronized (1 by 1)
            - vector cannot access multiple thread at a time so execution is slow
         */

        Vector v = new Vector();
        v.add("Amey");
        v.add("Trupti");
        v.add("Karan");
        System.out.println(v);

        v.remove("Amey");
        System.out.println(v.contains("Karan"));
        System.out.println(v);

        //22:00
    }
}
