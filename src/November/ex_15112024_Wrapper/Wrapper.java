package November.ex_15112024_Wrapper;

public class Wrapper {
    /*--------Wrapper----------
        - allows primitive datatype to be treated as objects
        - Collection Frameworks - have objects
        - so we convert all primitive datatype into objects
     */
    public static void main(String[] args) {

        int a = 10; //primitive datatype
        String s1 = new String("trupti");   //java wants to work with class and objects
        s1.contains("t");                          //as it has lot of funtions
        System.out.println(s1.contains("t"));

        Integer a1 = 10;    //wrapper
        System.out.println(a1.equals(10));  //as it has functions to use
    }
}
