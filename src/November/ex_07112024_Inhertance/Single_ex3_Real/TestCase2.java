package November.ex_07112024_Inhertance.Single_ex3_Real;

public class TestCase2 extends Common_BaseTest {
    TestCase2() {
        System.out.println("- DC - TC2 - Child");
    }

    void testcase2_call() {    //use attribute and behavior of parent directly
        startBrowser();
        System.out.println("TC2 executed..");
        readExcelFile();
        closeBrowser();
    }
}
