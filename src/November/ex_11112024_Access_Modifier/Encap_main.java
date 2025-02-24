package November.ex_11112024_Access_Modifier;

import November.ex_11112024_Access_Modifier.REAL.BaseClass;
import November.ex_11112024_Access_Modifier.REAL.TestCase1;

public class Encap_main {
    public static void main(String[] args) {

        //Dynamic dispatch - parent and child
        TestCase1 b1 = new TestCase1();
        b1.setBrowser("chrome", true);
        b1.startTC1();
    }
}
