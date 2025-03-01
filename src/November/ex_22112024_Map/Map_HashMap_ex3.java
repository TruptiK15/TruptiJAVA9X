package November.ex_22112024_Map;
import java.util.HashMap;
import java.util.Map;

public class Map_HashMap_ex3 {
    public static void main(String[] args) {

        //duplicate not allowed
        //order not maintained
        Map<String,Integer> m3 = new HashMap();
        m3.put("id", 1);
        m3.put("id", 2);    //keep latest value - replace duplicate
        m3.put("id1", 5);
        m3.put("id2", 10);
        m3.put("id3",null);
        m3.put(null,100);
        System.out.println(m3);

        //Iterate
        for (Map.Entry<String,Integer> item: m3.entrySet()){
            System.out.println(item.getKey()+ " --> " + item.getValue());
        }
    }
}
