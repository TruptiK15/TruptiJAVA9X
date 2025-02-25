package November.ex_14112024_Static_Keyword;

public class Static_ex2 {
    public static void main(String[] args) {

        //Automation a1 = new Automation();
        System.out.println(Automation.driver);  //static - so call directly
    }
}

class Automation{

    //common variable are static
    static String driver = "Chrome";
}