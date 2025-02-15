package October.ex_16102024_Scanner;
import java.util.Scanner;

public class Scanner_Task1_userinput {
    public static void main(String[] args) {

        //Task 1: Take a user input - Name, Age and Salary and print them in the end.
        Scanner sc = new Scanner(System.in);

        //Taking user input - Enter Name
        System.out.println("Enter your name: ");
        String name = sc.next();

        //Taking user input - Enter age
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        //Taking user input - Enter salary
        System.out.println("Enter your salary: ");
        double salary = sc.nextDouble();

        //Printing the user input
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        sc.close();
    }
}
