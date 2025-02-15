package October.ex_21102024_Loops;

public class Loops_For_ex4 {
    public static void main(String[] args) {

        for (int age = 0; age < 18; age++) {

            if (age > 15) {
                System.out.println("Gift from Dad, Iphone at age - " + age);
            } else {
                System.out.println("No Gift at age - " + age);
            }
        }
        System.out.println("End");
    }
}
