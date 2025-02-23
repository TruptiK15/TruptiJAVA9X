package November.ex_08112024_Encapsulation.Task2;

public class Method_Overriding {
    public static void main(String[] args) {
    CustomAssertion cus = new CustomAssertion();
    cus.verifyResponse();
    }
}

class BaseAssertion{
    void verifyResponse(){
        System.out.println("Verify response status..");
    }
}
class CustomAssertion extends BaseAssertion{
    @Override
    void verifyResponse(){
        System.out.println("Verify response status and security headers..");
    }
}