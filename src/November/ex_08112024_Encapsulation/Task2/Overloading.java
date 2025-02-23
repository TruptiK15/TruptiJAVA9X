package November.ex_08112024_Encapsulation.Task2;

public class Overloading {
    public static void main(String[] args) {

        TestExecution t1 = new TestExecution();
        t1.runTest();
        t1.runTest("Smoke Test");
        t1.runTest("Sanity Test", 1);
        t1.runTest("Regression Test", true, 3);
    }
}
class TestExecution{

    // Overloaded methods for different test execution scenarios
    //same name and different parameters
    void runTest(){
        System.out.println("Running test with default parameters...");
    }
    void runTest(String testname){
        System.out.println("Run Test: " + testname);
    }
    void runTest(String testname, int priority){
        System.out.println("Run Test: " + testname + " with priority : " + priority);
    }
    void runTest(String testname, boolean isflag, int tid){
        System.out.println("Run Test: " + testname + " its isFlag: " + isflag + " TextID: " + tid);
    }

}