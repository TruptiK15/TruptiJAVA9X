package October.ex_23102024_Function;

public class Function_static {
    public static void main(String[] args) {
        /*
        Function_static - referred as methods
        - block of code design to perform specific task
        - reuse it by calling it in main method
        - declared inside class
        - we cannot add function within function
         */
        //call static methods directly (function)
        greet();
        greet();
        greet();

        //call public methods (function)
        //we cannot call non static method directly
        Function_static fn = new Function_static();
        fn.intro();
    }
    static void greet(){
        System.out.println("Hello, How are you...?");
    }
    public void intro(){
        System.out.println("I am Trupti..");
    }
}
