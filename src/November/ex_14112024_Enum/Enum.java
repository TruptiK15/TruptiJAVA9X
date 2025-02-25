package November.ex_14112024_Enum;

public class Enum {
    /* ---Enum----
        - constant (hard coded value)
        - it is a special datatype that allows you to define collection of constants
        - represents fixed set of values - days of week, states, category of items
     */
    public static void main(String[] args) {

        System.out.println(Day.FRIDAY);
    }
}
//display constant data
enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}