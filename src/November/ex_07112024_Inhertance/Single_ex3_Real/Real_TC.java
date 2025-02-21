package November.ex_07112024_Inhertance.Single_ex3_Real;

public class Real_TC {
    public static void main(String[] args) {

        //They can access child TC because they are in same package
        //else we need to import them using import keyword and make them public
        TestCase1 t1 = new TestCase1();
        t1.testcase_call();

        System.out.println("-----------------------------------------");
        TestCase2 t2 = new TestCase2();
        t2.testcase2_call();
    }
}
