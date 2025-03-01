package November.ex_21112024_Collection_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_ex1 {

    public static void main(String[] args) {

        //Set - dublicates are not allowed
        //Set is a Interface

        Set s1 = new HashSet();
        s1.add("Trupti");
        s1.add("Trupti");
        s1.add("trupti");
        s1.add("Amey");
        System.out.println(s1);

        Set s2 = new LinkedHashSet();
        s2.add("Trupti");
        s2.add("Trupti");
        s2.add("trupti");
        s2.add("Amey");
        System.out.println(s2);

        Set s3 = new TreeSet();
        s3.add("Trupti");
        s3.add("Trupti");
        s3.add("trupti");
        s3.add("Amey");
        System.out.println(s3);

    }
}
