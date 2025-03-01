package November.ex_22112024_Map;
import java.util.HashMap;
import java.util.Map;

public class Map_HashMap_ex2 {
    public static void main(String[] args) {

        //duplicate not allowed
        //order not maintained
        //null is allowed
        Map<String,Integer> m3 = new HashMap();
        m3.put("id", 1);
        m3.put("id", 2);    //keep latest value - replace duplicate
        m3.put("id1", 5);
        m3.put("id2", 10);
        m3.put("id3",null);
        m3.put(null,123);
        System.out.println(m3);
        System.out.println(m3.size());
        System.out.println(m3.keySet());    //give all the keys
        System.out.println(m3.values());    //gove all the values
        System.out.println(m3.get("id3"));
        System.out.println(m3.containsValue(5));
        System.out.println(m3.containsKey("id1"));
    }
}
