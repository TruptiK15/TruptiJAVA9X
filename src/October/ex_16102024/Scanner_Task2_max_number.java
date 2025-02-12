package October.ex_16102024;

import java.util.Scanner;

public class Scanner_Task2_max_number {
    public static void main(String[] args) {

        //Task 2:  Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.
        Scanner sc = new Scanner(System.in);

        //Taking user input - Enter 1st no
        System.out.println("Enter 1st no: ");
        int no1 = sc.nextInt();

        //Taking user input - Enter 2nd no
        System.out.println("Enter 2nd no: ");
        int no2 = sc.nextInt();

        //Printing max no
        int max = (no1 > no2) ? no1 : no2;
        System.out.println("The maximum of " + no1 + " and " + no2 + " is " + max);
        sc.close();
    }
}
