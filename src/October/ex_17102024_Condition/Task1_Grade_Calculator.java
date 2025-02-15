package October.ex_17102024_Condition;

import java.util.Scanner;

public class Task1_Grade_Calculator {
    public static void main(String[] args) {
        /* Grade Calculator
        A - 90 - 100
        B - 80 - 89
        C - 70 - 79
        D - 60 - 69
        F - 0 -59

        Step 1:
        - Find input / output
        - Input | score - (0 - 100) --> datatype - int
        - Output | score - (A - F) --> datatype - char

        Step 2: Basic Logic
        if score >= 90 and score <=100 --> print A
        if score >= 80 and score <=89 --> print B
        if score >= 70 and score <=79 --> print C
        if score >= 60 and score <=69 --> print D
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score..");
        int score = sc.nextInt();
        char grade = 'F';

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else if (score >= 0 && score <= 59) {
            grade = 'F';
        } else {
            System.out.println("Invalid score..");
        }
        System.out.println("Your Grade is : " + grade);
        sc.close();
    }
}
