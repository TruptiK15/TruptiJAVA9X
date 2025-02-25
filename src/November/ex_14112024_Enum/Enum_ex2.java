package November.ex_14112024_Enum;

public class Enum_ex2 {
    /* ---Enum----
        - constant (hard coded value)
        - it is a special datatype that allows you to define collection of constants
        - represents fixed set of values - days of week, states, category of items
     */
    public static void main(String[] args) {

        System.out.println(URLS.google);
        System.out.println(URLS.vwo);
    }
}
//display constant data
//also store key value pair
enum URLS{
    google, vwo, katalon ;
}