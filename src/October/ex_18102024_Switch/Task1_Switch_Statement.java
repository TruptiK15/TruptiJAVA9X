package October.ex_18102024_Switch;
import java.util.Scanner;

public class Task1_Switch_Statement {
    public static void main(String[] args) {
        /* Create a simple calculator that performs addition, subtraction, multiplication, and division,
            modulus based on user input using switch statements.
            Inputs :   num 1, num 2, +
            Output :  num1+num2 → print information
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int no1 = sc.nextInt();
        System.out.print("Enter num1 : ");
        int no2 = sc.nextInt();
        System.out.println("Simple Calculator....Enter operation to perform..");
        String op = sc.next();
        int result;

        switch(op){
            case "+":
                result = no1 + no2;
                System.out.println("Addition : "+result);
                break;
            case "-":
                result = no1 - no2;
                System.out.println("Subtraction : "+result);
                break;
            case "*":
                result = no1 * no2;
                System.out.println("Multiplication : "+result);
                break;
            case "/":
                result = no1 / no2;
                System.out.println("Division : "+result);
                break;
            case "%":
                result = no1 % no2;
                System.out.println("Modulus : "+result);
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        sc.close();
    }
}
