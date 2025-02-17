package October.ex_29102024_Array;
import java.util.Scanner;
public class Array_Empty {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the no : " + (i + 1));
            numbers[i] = sc.nextInt();
        }

        System.out.println("-----");
        //Print the numbers entered by the user
        System.out.println("The numbers are : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        sc.close();
    }
}
