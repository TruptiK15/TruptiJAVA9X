package October.ex_17102024_Condition;
import java.util.Scanner;
public class Condition_if_else_even_odd {
    public static void main(String[] args) {

        //Create a program - Take user input
        //Check whether the input no is even or odd number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no, I will tell you it is odd or even..");
        int no = sc.nextInt();

        //use modulos
        if (no % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
        sc.close();
    }
}
