package October.ex_17102024_Condition;

import java.util.Scanner;

public class Condition_if {
    public static void main(String[] args) {

        /* Condition & Loops_For - Decision Maker in the programming
            1. If condition
            Syntax - if(condition){
            //code to be executed if condition is true
            }
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        //if age > 18   //Allowed to vote
        if(age > 18){
            System.out.println("Allowed to Vote...");
        }
        sc.close();
    }
}
