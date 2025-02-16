package October.ex_23102024_Function;

public class Function_User_Defined {
    public static void main(String[] args) {
        /* Functions
        - User Defined Functions
            1. Without Parameters and without return type
            2. Without Parameters and With return type
            3. With Parameters and without return type
            4. With Parameters and with return type
        */
        // 1. Without Parameters and without return type
        greet();

        // 2. Without Parameters and With return type
        String return_value = greet_with_hello();
        System.out.println(return_value);
    }
    // 1. Without Parameters and without return type
        static void greet(){
            System.out.println("Good morning..");
        }

    // 2. Without Parameters and With return type
        static String greet_with_hello(){
            System.out.println("Hello, How are you...?");
            return "I am Fine..";
        }
}
