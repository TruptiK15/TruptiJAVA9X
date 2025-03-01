package November.ex_22112024_Map;
import java.util.HashMap;
import java.util.Map;
public class Map_HashMap {
    public static void main(String[] args) {

        //HashMap - not sorted or in order
        Map m1 = new HashMap(); //Generics Fixed
        m1.put("name", "Trupti");   //add key value pair
        m1.put("rollno", 1);
        m1.put("phone", 12345);
        System.out.println(m1);

        //when to use Map and when to use List
        // List - for shooping list, single items
        // Map - Student info (name, roll for multiple data)

        //Datatype is fixed - key is in String & Value in Integer
        Map<String,Integer> m5 = new HashMap<String,Integer>();

        //After Jdk 8 - only write in left side
        Map<String,Integer> m2 = new HashMap<>();

        //Generics - datatype not fxied
        Map m4 = new HashMap();
    }
}
