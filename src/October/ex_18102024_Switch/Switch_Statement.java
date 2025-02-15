package October.ex_18102024_Switch;
import java.util.Scanner;
public class Switch_Statement {
    public static void main(String[] args) {
        /* Switch Statement
            //user enter int no from 1 to 7 - find which day it is
            1 --> Sunday
            2 --> Monday
            3 --> Tuesday
            4 --> Wednesday
            5 --> Thursday
            6 --> Friday
            7 --> Saturday
            0 or 8 or -1 --> invalid

            //without break - the valid and other code also gets executed
            //with break - only valid output will be displayed
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no from 1 to 7..");
        int day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        sc.close();
    }
}
