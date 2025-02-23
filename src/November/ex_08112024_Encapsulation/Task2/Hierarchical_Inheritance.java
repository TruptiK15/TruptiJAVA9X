package November.ex_08112024_Encapsulation.Task2;

public class Hierarchical_Inheritance {
    public static void main(String[] args) {

        UITest1 u1 = new UITest1();
        u1.setup();
        u1.executeUITest();
        System.out.println("--------------------------");

        APITest1 a1 = new APITest1();
        a1.setup();
        a1.executeAPITest();
    }
}

// Parent Class: BaseTest
class BaseTest1 {
    void setup() {
        System.out.println("Setting up test environment...");
    }
}

// Child 1: UITest (inherits BaseTest)
class UITest1 extends BaseTest {
    void executeUITest() {
        System.out.println("Running UI Test...");
    }
}

// Child 2: APITest (inherits BaseTest)
class APITest1 extends BaseTest {
    void executeAPITest() {
        System.out.println("Running API Test...");
    }
}
