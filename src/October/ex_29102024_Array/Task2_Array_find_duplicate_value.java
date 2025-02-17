package October.ex_29102024_Array;

import java.util.Scanner;

public class Task2_Array_find_duplicate_value {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        //Taking input nos
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the no : " + (i + 1));
            numbers[i] = sc.nextInt();
        }
        //Print the no entered by the user
        for (int j = 0; j < numbers.length; j++) {
            for (int k = j + 1; k < numbers.length; k++) {
                if (numbers[j] == numbers[k])
                    System.out.println("Duplicate found.." + numbers[k]);
            }
        }
        sc.close();
    }
}
