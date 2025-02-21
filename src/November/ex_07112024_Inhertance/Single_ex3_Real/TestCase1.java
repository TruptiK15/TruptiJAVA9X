package November.ex_07112024_Inhertance.Single_ex3_Real;

public class TestCase1 extends Common_BaseTest{

    TestCase1() {
        System.out.println("- DC - TC1 - Child");
    }
    void testcase_call(){    //use attribute and behavior of parent directly
        startBrowser();
        readExcelFile();
        closeBrowser();
    }
}
