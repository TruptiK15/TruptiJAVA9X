package October.ex_16102024_Scanner;

import java.util.Scanner;

public class Scanner_userinput {
    public static void main(String[] args) {

        /*Taking Input
        - Scanner Class
        - Arguments (in console)
        - BufferReader (Input Stream)
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        String verify = (age > 25) ? "Allowed to Goa" : "Not Allowed to Goa";
        System.out.println(verify);
        sc.close();
    }
}
