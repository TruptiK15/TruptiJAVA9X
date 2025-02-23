package November.ex_08112024_Encapsulation.Task2;

public class Single_Inheritance {
    public static void main(String[] args) {

        //Calling child function
        FunctionTest a1 = new FunctionTest();
        a1.setup();
        a1.TestLogin();
        a1.teardown();
    }
}

// Parent Class: BaseTest - Common setup & teardown for tests
class BaseTest {
    void setup() {
        System.out.println("Opening browser...");
    }

    void teardown() {
        System.out.println("Closing browser...");
    }
}

// Child Class: FunctionalTest - Inherits from BaseTest
class FunctionTest extends BaseTest {
    void TestLogin() {
        System.out.println("Executing Login Text");
    }
}