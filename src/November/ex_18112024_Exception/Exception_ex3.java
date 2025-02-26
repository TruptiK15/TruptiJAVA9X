package November.ex_18112024_Exception;

import java.util.Scanner;

public class Exception_ex3 {
    public static void main(Strings[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        System.out.println("Enter no : ");
        int v = sc.nextInt();
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            System.out.println("Closing sc..");
        }
    }
}
