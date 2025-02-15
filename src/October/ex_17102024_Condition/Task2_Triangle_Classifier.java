package October.ex_17102024_Condition;
import java.util.Scanner;
public class Task2_Triangle_Classifier {
    public static void main(String[] args) {
        /* Triangle Classifier:
        Write a program that classifies a triangle based on its side lengths.
        Given three input values representing the lengths of the sides, determine if the triangle is
        equilateral (all sides are equal), isosceles (exactly two sides are equal), or scalene (no sides are equal).
        Use an if-else statement to classify the triangle.
        side1, side2, side2 → eq, iso, scalene

        Step 1:
        - equilateral (all sides are equal)     --> 60 - 60 - 60
        - isosceles (exactly two sides are equal)   --> 45 - 60 - 45
        - scalene (no sides are equal)              --> 90 - 50 - 40
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side1..");
        int side1 = sc.nextInt();
        System.out.println("Enter side2..");
        int side2 = sc.nextInt();
        System.out.println("Enter side3..");
        int side3 = sc.nextInt();

        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Invalid input: side length must be positive...");
        } else if (side1 == side2 && side2 == side3 && side1 == side3) {
            System.out.println("Equilateral (all sides are equal)...");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Isosceles (exactly two sides are equal)...");
        } else{
            System.out.println("Scalene (no sides are equal)...");
        }
        sc.close();
    }
}
