package October.ex_23102024_Function;
import java.util.Scanner;
public class Task1_Function_Calculator {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter no1 : ");
                int a = sc.nextInt();
                System.out.println("Enter no2 : ");
                int b = sc.nextInt();

                System.out.println("Add : " + add(a,b));
                System.out.println("Subtract : " + subtract(a,b));
                System.out.println("Multiply : " + multiply(a,b));
                System.out.println("Divide : " + divide(a,b));
                sc.close();
        }
        //Find Edge cases and invalid input (divided by zero and enter string, float, other datatype)
        //Exception Handling
        public static int add(int a, int b) {
                return a + b;
        }
        public static int subtract(int a, int b) {
                return a - b;
        }
        public static int multiply(int a, int b) {
                return a * b;
        }
        public static int divide(int a, int b) {
                return a / b;
        }
}
