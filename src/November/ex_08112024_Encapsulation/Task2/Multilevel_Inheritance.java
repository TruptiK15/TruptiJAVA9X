package November.ex_08112024_Encapsulation.Task2;

public class Multilevel_Inheritance {
    public static void main(String[] args) {

        SecurityTest s1 = new SecurityTest();
        s1.setup();
        s1.sendRequest();
        s1.validateSecurityHeaders();
    }
}
// Grandparent Class: BaseTest
class BaseCase{
    void setup(){
        System.out.println("Initializing test environment...");
    }
}
// Parent Class: APITest (inherits BaseTest)
class APITest extends BaseTest {
    void sendRequest() {
        System.out.println("Sending API request...");
    }
}
// Child Class: SecurityTest (inherits APITest)
class SecurityTest extends APITest {
    void validateSecurityHeaders() {
        System.out.println("Validating security headers in API response...");
    }
}