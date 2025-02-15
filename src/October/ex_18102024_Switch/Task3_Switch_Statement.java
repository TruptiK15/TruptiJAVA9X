package October.ex_18102024_Switch;

import java.util.Scanner;

public class Task3_Switch_Statement {
    public static void main(String[] args) {
        /* Write a program that converts between different units
        (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
            Input. -
            choice - 1 - km → m, km → 1km
            choice - 2 - f → c, f → c
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the choice 1 or 2 : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the distance in Kilometer : ");
                float km = sc.nextInt();
                float miles = km * 0.62137f;
                System.out.println("Distance in Miles: " + miles);
                break;
            case 2:
                System.out.print("Enter the degree in Fahrenheit : ");
                float degree = sc.nextInt();
                float fah = ((degree - 32) * 5 / 9);
                System.out.println("Degree in Celsius : "+ fah);
                break;
            default:
                System.out.println("invalid input, enter proper choice");
                break;
        }
        sc.close();
    }
}
