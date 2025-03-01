package November.ex_21112024_Collection_LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_iterate {
    public static void main(String[] args) {

        List<String> l1 = new ArrayList();
        l1.add("Trupti");
        l1.add("Amey");
        l1.add("Kiara");

        //for each loop
        System.out.println("To Print ArrayList - For each Loop");
        for (String name : l1){
            System.out.println(name);
        }

        //normal for loop
        System.out.println("To Print ArrayList - For Loop");
        for (int i = 0; i < l1.size(); i++){
            System.out.println(l1.get(i));
        }

        //Iterator
        System.out.println("To Print ArrayList - iterator");
        Iterator<String> it = l1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
